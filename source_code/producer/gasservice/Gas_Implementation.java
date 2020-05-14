package gasservice;

public class Gas_Implementation implements Gas_Interface{
	
	@Override
	public int Payment(int Gas) {
		// TODO Auto-generated method stub
				if(Gas== 1){
					System.out.println("Size small");
					return Gas_Interface.size_small;
				}
				else if(Gas == 2){
					System.out.println("Size medium");
					return Gas_Interface.size_medium;
				}	
				else if(Gas == 3){
					System.out.println("Size large");
					return Gas_Interface.size_large;
				}
				else if(Gas == 4){
					System.out.println("Size extra large");
					return Gas_Interface.size_xlarge;
				}
				else {
					System.out.println("Invalid");
					return 0;
				}
				
	}

	@Override
	public void ListGas() {
		// TODO Auto-generated method stub
		System.out.println(" 1 : Size small "+Gas_Interface.size_small+".00 lkr");
		System.out.println(" 2 : Size medium "+Gas_Interface.size_medium+".00 lkr");
		System.out.println(" 3 : Size large "+Gas_Interface.size_large+".00 lkr");
		System.out.println(" 4 : Size extra large "+Gas_Interface.size_xlarge+".00 lkr");		
	}


}
