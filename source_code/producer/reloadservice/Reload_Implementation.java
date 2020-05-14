package reloadservice;

public class Reload_Implementation implements Reload_Interface {

    @Override
    public int SelectBrandOfConnection(int brand) {
        // TODO Auto-generated method stub
        if(brand == 1){
            System.out.println("Dialog");
            return Reload_Interface.dialog;
            }
        else if(brand == 2){
            System.out.println("Mobitel");
            return Reload_Interface.mobitel;
            } 
        else if(brand == 3){
                System.out.println("Hutch");
                return Reload_Interface.hutch;
            }               
        else if(brand == 4){
                System.out.println("Airtel");
                return Reload_Interface.airtel;
            } 
        else{
            System.out.println("Invalid Input ...!");
        }
		return 0;    
    }

    public void DisplayBrand() {
        System.out.println("Please Select Your Connection ..");
//        System.out.println("Please Enter by Number");
        System.out.println(" 1 . Dialog");
        System.out.println(" 2 . Mobitel");
        System.out.println(" 3 . Hutch");
        System.out.println(" 4 . Airtel");
    }

    public void PrintNumber(int number){
    	 System.out.println( "Your connection is +94"+number);         
    }
    public int  PrintAmountAndSuccessMsg(int amount){
        System.out.println( "Suceessfully reloaded");
        return amount;
    }
   

}