package org.nasdanika.models.nxcore.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.runtime.InvokerHelper;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.nasdanika.models.nxcore.GroovyEvaluator;
import org.nasdanika.models.nxcore.ScriptEvaluator;
import org.nasdanika.models.nxcore.SourceEvaluator;
import org.nasdanika.models.nxcore.SpelEvaluator;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.Script;

public class EvaluatorSupport {
	
	public static String loadSource(SourceEvaluator sourceEvaluator) {
		String script = sourceEvaluator.getScript();
		String scriptRef = sourceEvaluator.getScriptRef();
		boolean hasScript = script != null && !script.isBlank();
		boolean hasScriptRef = scriptRef != null && !scriptRef.isBlank();
		if (hasScript == hasScriptRef) {
			throw new IllegalStateException(
				"Exactly one of script and scriptRef must be set: " + sourceEvaluator);
		}
		if (hasScript) {
			return script;
		}
		URI refURI = resolveScriptRef(sourceEvaluator);
		URIConverter uriConverter = sourceEvaluator.eResource() != null && sourceEvaluator.eResource().getResourceSet() != null
			? sourceEvaluator.eResource().getResourceSet().getURIConverter()
			: URIConverter.INSTANCE;
		try (InputStream in = uriConverter.createInputStream(refURI)) {
			return new String(in.readAllBytes(), StandardCharsets.UTF_8);
		} catch (IOException e) {
			throw new IllegalStateException("Cannot load script from " + refURI + ": " + e, e);
		}
	}
	
	public static URI resolveScriptRef(SourceEvaluator sourceEvaluator) {
		URI refURI = URI.createURI(sourceEvaluator.getScriptRef());
		Resource resource = sourceEvaluator.eResource();
		if (refURI.isRelative() && resource != null
				&& resource.getURI() != null && resource.getURI().isHierarchical()) {
			refURI = refURI.resolve(resource.getURI());
		}
		return refURI;
	}
	
	private static final Map<String, Class<? extends Script>> CLASS_CACHE =	Collections.synchronizedMap(new WeakHashMap<>());	
	
	public static <T> T evaluateGroovy(GroovyEvaluator groovyEvaluator, Class<T> resultType, Map<String, Object> bindings) {
		String source = loadSource(groovyEvaluator);
		Class<? extends Script> theClass;
		synchronized (groovyEvaluator) {
			Class<? extends Script> scriptClass = CLASS_CACHE.get(source);
			if (scriptClass == null) {
				CompilerConfiguration config = new CompilerConfiguration();
				try (GroovyClassLoader classLoader = new GroovyClassLoader(groovyEvaluator.getClass().getClassLoader(), config)) {
					String scriptName = groovyEvaluator.getScriptRef() != null && !groovyEvaluator.getScriptRef().isBlank()
						? resolveScriptRef(groovyEvaluator).lastSegment()
						: "GroovyEvaluator_" + Integer.toHexString(System.identityHashCode(groovyEvaluator));
					@SuppressWarnings("unchecked")
					Class<? extends Script> parsed =
						(Class<? extends Script>) classLoader.parseClass(source, scriptName);
					scriptClass = parsed;
					CLASS_CACHE.put(source, scriptClass);
				} catch (IOException e) {
					throw new IllegalStateException("Cannot parse Groovy script: " + e, e);
				}
			}
			theClass = scriptClass;
		}

		Binding binding = new Binding(bindings == null
			? new java.util.HashMap<>()
			: new java.util.HashMap<>(bindings));
		Script script = InvokerHelper.createScript(theClass, binding);
		Object result = script.run();

		if (resultType == null || result == null) {
			@SuppressWarnings("unchecked")
			T ret = (T) result;
			return ret;
		}
		@SuppressWarnings("unchecked")
		T ret = (T) DefaultTypeTransformation.castToType(result, resultType);
		return ret;
	}	
	
	public static <T> T evaluateScript(ScriptEvaluator scriptEvaluator, Class<T> resultType, Map<String, Object> bindings) {
		String script = scriptEvaluator.getScript();
		String scriptRef = scriptEvaluator.getScriptRef();
		boolean hasScript = script != null && !script.isBlank();
		boolean hasScriptRef = scriptRef != null && !scriptRef.isBlank();
		if (hasScript == hasScriptRef) { // both or neither
			throw new IllegalStateException(
				"Exactly one of script and scriptRef must be set: " + scriptEvaluator);
		}

		ScriptEngineManager engineManager = new ScriptEngineManager(scriptEvaluator.getClass().getClassLoader());
		ScriptEngine engine;
		String source;

		if (hasScript) {
			String language = scriptEvaluator.getLanguage();
			if (language == null || language.isBlank()) {
				throw new IllegalStateException("language is required for inline script: " + scriptEvaluator);
			}
			engine = engineManager.getEngineByName(language);
			if (engine == null) {
				throw new IllegalStateException("No script engine for language: " + language);
			}
			source = script;
		} else {
			URI refURI = URI.createURI(scriptRef);
			Resource resource = scriptEvaluator.eResource();
			if (refURI.isRelative() && resource != null
					&& resource.getURI() != null && resource.getURI().isHierarchical()) {
				refURI = refURI.resolve(resource.getURI());
			}

			String language = scriptEvaluator.getLanguage();
			if (language != null && !language.isBlank()) {
				engine = engineManager.getEngineByName(language);
				if (engine == null) {
					throw new IllegalStateException("No script engine for language: " + language);
				}
			} else {
				String extension = refURI.fileExtension();
				if (extension == null) {
					throw new IllegalStateException(
						"language is not set and scriptRef has no extension: " + refURI);
				}
				engine = engineManager.getEngineByExtension(extension);
				if (engine == null) {
					throw new IllegalStateException("No script engine for extension: " + extension);
				}
			}

			URIConverter uriConverter = resource != null && resource.getResourceSet() != null
				? resource.getResourceSet().getURIConverter()
				: URIConverter.INSTANCE;
			try (InputStream in = uriConverter.createInputStream(refURI)) {
				source = new String(in.readAllBytes(), StandardCharsets.UTF_8);
			} catch (IOException e) {
				throw new IllegalStateException("Cannot load script from " + refURI + ": " + e, e);
			}
		}

		Bindings engineBindings = engine.createBindings();
		if (bindings != null) {
			engineBindings.putAll(bindings);
		}
		engineBindings.put("self", scriptEvaluator);
		
		try {
			Object result = engine.eval(source, engineBindings);
			if (resultType == null || result == null) {
				@SuppressWarnings("unchecked")
				T ret = (T) result;
				return ret;
			}
			return resultType.cast(result);
		} catch (ScriptException e) {
			throw new IllegalStateException("Script evaluation failed: " + e, e);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T evaluateSpel(SpelEvaluator spelEvaluator, Class<T> resultType, Map<String, Object> bindings) {
		String expressionSource = spelEvaluator.getExpression();
		if (expressionSource == null || expressionSource.isBlank()) {
			throw new IllegalStateException("expression is not set: " + spelEvaluator);
		}
		Expression expression = new SpelExpressionParser().parseExpression(expressionSource);
		StandardEvaluationContext evaluationContext = new StandardEvaluationContext(spelEvaluator); // self as root
		if (bindings != null) {
			bindings.forEach(evaluationContext::setVariable);
		}
		return resultType == null
			? (T) expression.getValue(evaluationContext)
			: expression.getValue(evaluationContext, resultType);
	}	
	
}
