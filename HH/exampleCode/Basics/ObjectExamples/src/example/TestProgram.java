/**
 * 
 */
package example;

import javax.swing.JOptionPane;

/**
 * @author hhussain
 *
 */
public class TestProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basket myShopping = new Basket(12);
		
		//add some test Items
		myShopping.addShoppingItem("apples", 1.25f);
		myShopping.addShoppingItem("grapes", 4.25f);
		myShopping.addShoppingItem("cherries", 9.99f);
		myShopping.addShoppingItem("Baguette", 4.25f);
		myShopping.addShoppingItem("Crisps", 1.05f);
		myShopping.addShoppingItem("Lemons", 0.99f);
		
		JOptionPane.showMessageDialog(null, myShopping.getDescriptionOfAllItems() );

	}

}
