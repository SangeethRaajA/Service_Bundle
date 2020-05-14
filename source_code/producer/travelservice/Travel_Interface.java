package travelservice;

public interface Travel_Interface {
	public int Payment(int travel);
	public void ListVehicle();	
	public void ListPrice();	

	public String good = "less than 1km";
	public String better = "within 5kms";
	public String best = "more than 5kms";
	
	public int one = 70;
	public int five = 65;
	public int ten = 60;
	
}
