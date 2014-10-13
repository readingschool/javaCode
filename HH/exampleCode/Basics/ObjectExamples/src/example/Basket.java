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
		for(int i=0; i<this.shopping.length; i++)
		{
			sDescription += this.shopping[i].returnDescription();	//collect all the descriptions of the items
		}
		return(sDescription);
	}

}
