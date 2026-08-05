/**
 */
package org.nasdanika.models.nxcore.impl;

import java.util.Map;

import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.runtime.InvokerHelper;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.nxcore.GroovyEvaluator;
import org.nasdanika.models.nxcore.NxcorePackage;

import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.Script;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Groovy Evaluator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GroovyEvaluatorImpl extends SourceEvaluatorImpl implements GroovyEvaluator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroovyEvaluatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NxcorePackage.Literals.GROOVY_EVALUATOR;
	}
	
	private transient Class<? extends Script> scriptClass; // guarded by this
	private transient String compiledSource;

	/**
	 * @generated NOT
	 */
	@Override
	public <T> T evaluate(Class<T> resultType, Map<String, Object> bindings) {
		String source = loadSource();
		Class<? extends Script> theClass;
		synchronized (this) {
			if (scriptClass == null || !source.equals(compiledSource)) {
				CompilerConfiguration config = new CompilerConfiguration();
				GroovyClassLoader classLoader =
					new GroovyClassLoader(getClass().getClassLoader(), config);
				String scriptName = getScriptRef() != null && !getScriptRef().isBlank()
					? resolveScriptRef().lastSegment()
					: "GroovyEvaluator_" + Integer.toHexString(System.identityHashCode(this));
				@SuppressWarnings("unchecked")
				Class<? extends Script> parsed =
					(Class<? extends Script>) classLoader.parseClass(source, scriptName);
				scriptClass = parsed;
				compiledSource = source;
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

} //GroovyEvaluatorImpl
