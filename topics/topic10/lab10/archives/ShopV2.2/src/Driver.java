import java.util.Scanner;

/**
 * This class runs the application and handles the Product I/O
 *
 * @author Siobhan Drohan, Mairead Meagher
 * @version 2.2
 *
 */
public class Driver{

    private Scanner input = new Scanner(System.in);
    private Store store;

    public static void main(String[] args) {
        new Driver();
    }

    public Driver() {
        processOrder();
        runMenu();
    }

    private int mainMenu(){
        System.out.print("""
               Shop Menu
               ---------
                  1) List the Products
                  2) List the current products
                  3) Display average product unit cost
                  4) Display cheapest product
                  5) List products that are more expensive than a given price
                  0) Exit
               ==>> """);
        int option = input.nextInt();
        return option;
    }

    private void runMenu(){
        int option = mainMenu();

        while (option != 0){

            switch (option){
                case 1 -> printProducts();
                case 2 -> printCurrentProducts();
                case 3 -> printAverageProductPrice();
                case 4 -> printCheapestProduct();
                case 5 -> printProductsAboveAPrice();
                default -> System.out.println("Invalid option entered: " + option);
            }

            //pause the program so that the user can read what we just printed to the terminal window
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine(); //second read is required - bug in Scanner class; a String read is ignored straight after reading an int.

            //display the main menu again
            option = mainMenu();
        }

        //the user chose option 0, so exit the program
        System.out.println("Exiting...bye");
        System.exit(0);
    }


    private void processOrder(){
        //find out from the user how many products they would like to order
        System.out.print("How many Products would you like to have in your Store?  ");
        int numberProducts = input.nextInt();

        store = new Store(numberProducts);

        //ask the user for the details of the products and add them to the order
        for (int i = 0; i < numberProducts; i++){
            addProduct();
        }
    }

    //gather the product data from the user and create a new product object.
    private void addProduct(){
        input.nextLine();  //dummy read of String to clear the buffer - bug in Scanner class.

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

        boolean isAdded = store.add(new Product(productName, productCode, unitCost, inCurrentProductLine));
        if (isAdded){
            System.out.println("Product Added Successfully");
        }
        else{
            System.out.println("No Product Added");
        }
    }
    
    //print the product (the toString method is automatically called).
    private void printProducts(){
        System.out.println("List of Products are:");
        System.out.println(store.listProducts());
    }

    //print out a list of all current products i.e. that are in the current product line.
    private void printCurrentProducts(){
        System.out.println("List of CURRENT Products are:");
        System.out.println(store.listCurrentProducts());
    }

    //print out the average product price for all products stored in the array
    private void printAverageProductPrice(){
        double averagePrice = store.averageProductPrice();
        if (averagePrice != -1){
            System.out.println("The average product price is: " + averagePrice);
        }
        else{
            System.out.println("There are no products in the store.");
        }
    }

    //print out the product name that is the cheapest of those stored in the array
    private void printCheapestProduct(){
        Product cheapestProduct = store.cheapestProduct();
        if (cheapestProduct != null) {
            System.out.println("The cheapest product is:  " + cheapestProduct.getProductName());
        }
        else{
            System.out.println("There are no products in the store.");
        }
    }

    //ask the user to enter a price and print out all products costing that price or more.
    private void printProductsAboveAPrice(){
        System.out.print("View the products costing more than this price:  ");
        double price = input.nextDouble();
        System.out.println(store.listProductsAboveAPrice(price));
    }

}