/*
 * generated by Xtext
 */
package gov.nasa.ensemble.dictionary.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import gov.nasa.ensemble.dictionary.xtext.ui.internal.XDictionaryActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XDictionaryExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return XDictionaryActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return XDictionaryActivator.getInstance().getInjector(XDictionaryActivator.GOV_NASA_ENSEMBLE_DICTIONARY_XTEXT_XDICTIONARY);
	}
	
}
