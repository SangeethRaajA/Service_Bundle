package reloadservice;

public interface Reload_Interface {

	public void DisplayBrand(); 
    public int SelectBrandOfConnection(int brand);
    public void PrintNumber(int number);
    public int PrintAmountAndSuccessMsg(int amount); 

    int dialog = 077;
	int mobitel = 071;
	int hutch = 070;
	int airtel = 075;
}
