package consumer_01;

import java.util.*;

import gasservice.Gas_Interface;
import reloadservice.Reload_Interface;
import travelservice.Travel_Interface;

public class SubMethod {
	
	public static  List<Object> stringlist=new ArrayList<Object>();
	public static  List<Object> TotalInvoicelist=new ArrayList<Object>();
	public static float TotalPrice=0;
	
	//method to select service
	public static int find() {
		Scanner sc = new Scanner(System.in);
		String user_option = "yes";
		
		System.out.println("Select the type of service\n1. Gas Service\n2. Reload Service\n3. Travel Service"); 
		System.out.printf("Enter the number :");
		int details = sc.nextInt();
		   
		   if(details == 1) {
			  return 1;
		   }
		   else if(details == 2) {
			   return 2;
		   }
		   else if(details == 3) {
			   return 3;
		   }
		   else
		   return 0;
	}

	//method to access gas service
	public static void gasService(Gas_Interface gas) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Select the type of gas\n1. Litro\n2. Laugh");
	    System.out.printf("Enter the number : ");
	    String gasType = myObj.nextLine();  
	    
	    System.out.println("\nThe price of the gas according to the size");
	    
		//enter the size of the gas
		Scanner scan=new Scanner(System.in);
		consumer u1 = new consumer();
		gas.ListGas();
		
		String user_option="yes";
		int total=0;
		
		do {

			System.out.println("Select the size of gas\n1. Small\n2. Medium\n3. Large\n4. Extra Large");
			System.out.printf("Enter the number : ");
			int size=scan.nextInt();
			
			if(size == 1) {
				System.out.println("Your selection for small gas is successful ");		
				System.out.println("Current Bill: "+gas.Payment(size));
				total+=gas.Payment(size);
				
				u1.setPayment(gas.size_small);
				
				stringlist.add(u1.getPayment());
				
				TotalPrice += gas.Payment(size);
			}
			else if(size == 2) {
				System.out.println("Your selection for small gas is successful ");							
				System.out.println("Current Bill: "+gas.Payment(size));
				
				total+=gas.Payment(size);
				
				u1.setPayment(gas.size_medium);
				
				stringlist.add(u1.getPayment());
				
				TotalPrice += gas.Payment(size);
			}			
			else if(size == 3) {
				System.out.println("Your selection for small gas is successful ");			
				System.out.println("Current Bill: "+gas.Payment(size));
				total+=gas.Payment(size);
				
				u1.setPayment(gas.size_large);
				
				stringlist.add(u1.getPayment());
				
				TotalPrice += gas.Payment(size);
			}
			else if(size == 4) {
				System.out.println("Your selection for small gas is successful ");				
				System.out.println("Current Bill: "+gas.Payment(size));
				total+=gas.Payment(size);
				
				u1.setPayment(gas.size_xlarge);
				;
				stringlist.add(u1.getPayment());
				
				TotalPrice += gas.Payment(size);
			}
			else 
				System.out.println("Unexpected error! Please try again");
			   
				u1.setPayment(total);
				stringlist.add(u1.getPayment());			
			
				total=0;
				System.out.println("Do you want to continue? 'yes' for YES \n 'no' for NO");
				user_option=scan.next();		
			}
		while(user_option.equals("yes")); 
		
		//printing the bill for gas
		System.out.println("*******************************************************");
		System.out.println("                 GAS SERVICE BILL                      ");
		System.out.println("*******************************************************");
		

		System.out.println("-------------------------------------------------------");   
		System.out.println("   	Total bill: " +TotalPrice);
		System.out.println("*******************************************************");
		System.out.println("        Thank you & Have nice day..!                   ");
		
		stringlist.clear();
		
		u1.setPayment(TotalPrice);

		TotalInvoicelist.add(u1.getPayment());
		TotalPrice=0;
	}
	
	//method to access reload service
	public static void reloadService(Reload_Interface reload) {
		Scanner scan=new Scanner(System.in);
		consumer u2 = new consumer();

		String user_option="yes";
		int total=0;
		do {
			reload.DisplayBrand();
			System.out.printf("Enter your connection brand");
			String answer=scan.nextLine();
			
			if(answer != null ) {
				Scanner scan2 = new Scanner(System.in);		
				System.out.println("Enter your number");
				int number = scan2.nextInt();
				reload.PrintNumber(number);
				
				Scanner scan3 = new Scanner(System.in);	
				System.out.printf("Enter the amount to be reloaded ");
				int amount = scan3.nextInt();				
				
				total += amount;
				TotalPrice += reload.PrintAmountAndSuccessMsg(amount);

			}			
			else 
				System.out.println("Unexpected error! Please try again");
			
				u2.setPayment(total);
				 stringlist.add(u2.getPayment());			
				
				total=0;	
				
				System.out.println("Do you want to continue? 'yes' for YES \n 'no' for NO and you can find another services");
				user_option=scan.next();			
			
			}
			while(user_option.equals("yes")); 
			
			System.out.println("*******************************************************");
			System.out.println("                 RELOAD BILL                           ");
			System.out.println("*******************************************************");
	
			System.out.println("-------------------------------------------------------");   
			System.out.println("   	Total bill: " +TotalPrice);
			System.out.println("*******************************************************");
			System.out.println("        Thank you & Have nice day..!                   ");
			
			stringlist.clear();
		     
			u2.setPayment(TotalPrice);

			TotalInvoicelist.add(u2.getPayment());
			TotalPrice=0;
		
	}	
	
	//method to access travel service
	public static void travelService(Travel_Interface travel) {

		Scanner scan=new Scanner(System.in);
		consumer u3 = new consumer();
		
		System.out.println("select the type of vehicle");
		Scanner s1 = new Scanner(System.in);  // Create a Scanner object
		travel.ListVehicle();
	    System.out.printf("Enter the number : ");
	    String vehicleType = s1.nextLine();  
	    
		//enter the distance
	    System.out.println("select the travel range");
		Scanner s2=new Scanner(System.in);
		travel.ListPrice();
		int option = s2.nextInt();
		
		String user_option="yes";
		
		int total=0;
		
		do {
			Scanner s3=new Scanner(System.in);
			System.out.printf("Enter the distance: ");
			int dis=s3.nextInt();
			
			if(dis == 1) {
				total=travel.Payment(option)*dis;
				TotalPrice=total;
			}
			else if(dis >1 && dis<5) {
				total=travel.Payment(option)*dis;
				TotalPrice=total;
			}
			else if(dis >5) {
				total=travel.Payment(option)*dis;
				TotalPrice=total;
			}else 
				System.out.println("Unexpected error! Please try again");
			
				u3.setPayment(total);
				 stringlist.add(u3.getPayment());			
				
				total=0;	
				
				System.out.println("Do you want to continue? 'yes' for YES \n 'no' for NO and you can find another services");
				user_option=scan.next();			
			
			
			
		}while(user_option.equals("yes")); 
		
		//printing the bill for transport service
		System.out.println("*******************************************************");
		System.out.println("                 TRANSPORT BILL                        ");
		System.out.println("*******************************************************");
		
		System.out.println("-------------------------------------------------------");   
		System.out.println("   	Total bill: " +TotalPrice);
		System.out.println("*******************************************************");
		System.out.println("        Thank you & Have nice day..!                   ");
		
		stringlist.clear();
		
		u3.setPayment(TotalPrice);

		TotalInvoicelist.add(u3.getPayment());
		TotalPrice=0;
	}
	
	//method to access print bill
	public static void PrintBill() {
		
		System.out.println("*******************************************************");
		System.out.println("                 TOTAL INVOICE                         ");
		System.out.println("*******************************************************");
		System.out.println("	 			 Items 	Price                          ");
		
		for(Object obj:TotalInvoicelist) {
			if(obj.getClass()==Integer.class) {
				 System.out.print(" "+obj+" \t");
			}
			if(obj.getClass()==String.class) {

				 System.out.print(" "+obj+" \t ");

			}
			if(obj.getClass()==Float.class) {

				 System.out.print(" "+obj+"\n ");
				 TotalPrice+=(Float)obj;
			}
			
	      }
		
		//printing the bill for total cost
		System.out.println("-------------------------------------------------------");   
		System.out.println("   	Total bill: " +TotalPrice);
		System.out.println("*******************************************************");
		System.out.println("        Thank you & Have nice day..!                   ");
		TotalInvoicelist.clear();
		TotalPrice=0;
	}

}
