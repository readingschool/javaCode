/**
 * 
 */
package example;

/**
 * @author hhussain
 *
 */
public class Item {
	
	//Variables
	String sName;
	float fUnitPrice;
		
	//Constructor
	public Item(String sThisItemsName, float fThisItemsPrice)
	{
		this.sName = sThisItemsName;
		this.fUnitPrice = fThisItemsPrice;
	}
	
	//Methods
	public String returnDescription()
	{
		return("Item name: " + this.sName + "\nItem price: " + this.fUnitPrice);
	}
}
