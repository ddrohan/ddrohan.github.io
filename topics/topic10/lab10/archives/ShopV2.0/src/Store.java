/**
 * The store class saves all the entered products into a primitive array.
 *
 * @author Mairead Meagher, Siobhan Drohan
 * @version 2.0
 */

public class Store {

    private Product[] products;
    private int total = 0;  //dual purpose. 1) number of items stored in array, 2) next available index location

    public Store(int numberItems){
        products = new Product[numberItems];
    }

    private boolean isFull(){
        return total == products.length;
    }

    private boolean isEmpty(){
        return total == 0;
    }

    /**
     *  If there is space available, add the product object, passed as a parameter, to the array.
     * @param product  Product object to be added to the array.
     * @return Status of the add; true for success, false for fail.
     */
    public boolean add(Product product){
        if (isFull()){
            return false;
        }
        else{
            products[total] = product;
            total++;
            return true;
        }
    }

    /**
     * This method builds and returns a String containing all the products in the array.
     * For each product in the array, the associated index number is included.
     * If no products are stored in the array, the String "No products" is returned.
     *
     * @return  A String containing all the products in the array, or "No products in the store", if empty.
     */
    public String listProducts(){
        if (isEmpty()){
            return "No products in the store";
        }
        else{
            String listOfProducts = "";
            for (int i = 0; i < total; i++){
                listOfProducts = listOfProducts + i + ": " + products[i] + "\n";
            }
            return listOfProducts;
        }
    }

}
