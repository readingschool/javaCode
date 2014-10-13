/**
 * 
 */
package example;

/**
 * @author hhussain
 *
 */
public class Basket {
	//variables
	Item[] shopping;
	int iNumberOfItems, iCapacityOfBasket;
	
	//constructor
	public Basket(int iMaxNoOfItems)
	{
		this.iCapacityOfBasket = iMaxNoOfItems;
		this.shopping = new Item[this.iCapacityOfBasket];
	}
	
	//methods
	//some code to print out all the items in this basket
	public String getDescriptionOfAllItems()
	{
		String sDescription = "";
		for(int i=0; i<this.iNumberOfItems; i++)
		{
			sDescription += this.shopping[i].returnDescription() + "\n\n";	//collect all the descriptions of the items
		}
		return(sDescription);
	}
	
	//add item to shopping basket
	public void addShoppingItem(String sName, float fAmount)
	{
		this.shopping[this.iNumberOfItems] = new Item(sName, fAmount);
		this.iNumberOfItems++;
	}

}
