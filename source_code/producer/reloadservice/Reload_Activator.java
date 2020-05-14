package reloadservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class Reload_Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Reload_Activator.context = bundleContext;
		System.out.println("Reload bundule started.");
		this.ReloadService();
		System.out.println("Reload service started.");
	}
	
	private void ReloadService(){
		Reload_Interface Reload_service = new Reload_Implementation();
		context.registerService(Reload_Interface.class, Reload_service,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Reload_Activator.context = null;
		System.out.println("Reload service stopped.");
	}

}
