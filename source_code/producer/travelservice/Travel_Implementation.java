package travelservice;

public class Travel_Implementation implements Travel_Interface {
	
	public void ListVehicle() {
		System.out.println("1 : Three-wheel");
		System.out.println("2 : car");
		System.out.println("3 : van");
	}

	public void ListPrice() {
		// TODO Auto-generated method stub
		System.out.println("1 : less than 1km "+Travel_Interface.one+".00 lkr");
		System.out.println("2 : within 5kms "+Travel_Interface.five+".00 lkr");
		System.out.println("3 : more than 5kms "+Travel_Interface.ten+".00 lkr");
	}
	
	public int Payment(int travel) {
		// TODO Auto-generated method stub
				if(travel== 1){
					System.out.println("less than 1km");
					return Travel_Interface.one;
				}
				else if(travel == 2){
					System.out.println("within 5kms");
					return Travel_Interface.five;
				}	
				else if(travel == 3){
					System.out.println("more than 5kms");
					return Travel_Interface.ten;
				}				
				else {
					System.out.println("Invalid input");
					return 0;
				}
				
	}
}
