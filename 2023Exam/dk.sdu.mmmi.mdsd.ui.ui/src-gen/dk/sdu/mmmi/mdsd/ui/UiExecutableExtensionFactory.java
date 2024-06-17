/*
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.ui;

import com.google.inject.Injector;
import dk.sdu.mmmi.mdsd.ui.ui.internal.UiActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UiExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(UiActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		UiActivator activator = UiActivator.getInstance();
		return activator != null ? activator.getInjector(UiActivator.DK_SDU_MMMI_MDSD_UI) : null;
	}

}