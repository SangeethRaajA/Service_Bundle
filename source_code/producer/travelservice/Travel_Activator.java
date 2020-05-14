package travelservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Travel_Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Travel_Activator.context = bundleContext;
		System.out.println("Travel bundule started.");
		this.TravelService();
		System.out.println("Travel service started.");
	}
	
	private void TravelService(){
		Travel_Interface Travel_service = new Travel_Implementation();
		context.registerService(Travel_Interface.class, Travel_service,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Travel_Activator.context = null;
		System.out.println("Travel service stopped.");
	}

}
