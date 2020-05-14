package gasservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Gas_Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Gas service bundle started");
		Gas_Activator.context = bundleContext;
		this.GasService();
		System.out.println("Gas service started.");
	}
	
	private void GasService(){
		Gas_Interface Gas_service = new Gas_Implementation();
		context.registerService(Gas_Interface.class, Gas_service,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Gas_Activator.context = null;
		System.out.println("Gas service service stopped.");
	}


}
