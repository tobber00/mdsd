/*
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.ui;

import com.google.inject.Injector;
import dk.sdu.mmmi.mdsd.math.ui.internal.MathActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MathExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(MathActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		MathActivator activator = MathActivator.getInstance();
		return activator != null ? activator.getInjector(MathActivator.DK_SDU_MMMI_MDSD_MATH) : null;
	}

}
