import java.util.Scanner;

/**
 * This class runs the application and handles the Product I/O
 *
 * @author Siobhan Drohan, Mairead Meagher
 * @version 1.0
 *
 */
public class Driver{

    private Scanner input = new Scanner(System.in);
    private Product product;

    /**
     * The main method is the starting point for the program.
     * When started, the main method calls the addProduct() method
     * followed by the printProduct() method.
     *
     * @param args  Any arguments for the main method
     */
    public static void main(String[] args) {
		Driver driver = new Driver();
		driver.addProduct();
		driver.printProduct();
	}

    //gather the product data from the user and create a new product object.
    private void addProduct(){
    	System.out.print("Enter the Product Name:  ");
        String productName = input.nextLine();
        System.out.print("Enter the Product Code:  ");
        int productCode = input.nextInt();
        System.out.print("Enter the Unit Cost:  ");
        double unitCost = input.nextDouble();

        //Ask the user to type in either a Y or an N.  This is then
        //converted to either a True or a False (i.e. a boolean value).
    	System.out.print("Is this product in your current line (y/n): ");
    	char currentProduct = input.next().charAt(0);
    	boolean inCurrentProductLine = false;
    	if ((currentProduct == 'y') || (currentProduct == 'Y'))
    		inCurrentProductLine = true;
    	
        product = new Product(productName, productCode, unitCost, inCurrentProductLine);
    }
    
    //print the product (the toString method is automatically called).
    private void printProduct(){
    	System.out.println(product);
    }
	   	
}