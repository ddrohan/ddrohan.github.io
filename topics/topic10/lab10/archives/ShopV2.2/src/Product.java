/**
 * A scaled down version of a Product class
 *
 * @author Mairead Meagher, Siobhan Drohan
 * @version 2.2
 */
public class Product {

    private String productName = "";
    private int productCode = -1;
    private double unitCost = 0;
    private boolean inCurrentProductLine = false;

    /**
     * Constructor for objects of class Product
     * @param productName Name of the product
     * @param productCode Code of the product
     * @param unitCost Unit cost of the product
     */
    public Product(String productName, int productCode, double unitCost, boolean inCurrentProductLine) {
        this.productName = productName;
        this.productCode = productCode;
        this.unitCost = unitCost;
        this.inCurrentProductLine = inCurrentProductLine;
    }

    //-------
    //getters
    //-------
    /**
     * Returns the Product Name
     */
    public String getProductName(){
        return productName;
    }

    /**
     * Returns the Unit Cost
     */
    public double getUnitCost(){
        return unitCost;
    }

    /**
     * Returns the Product Code
     */
    public int getProductCode() {
        return productCode;
    }

    /**
     * Returns a boolean indicating if the product is in the current product line
     */
    public boolean isInCurrentProductLine() {
        return inCurrentProductLine;
    }

    //-------
    //setters
    //-------
    /**
     * Updates the Product Code to the value passed as a parameter
     * @param productCode The new Product Code
     */
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    /**
     * Updates the Product Name to the value passed as a parameter
     * @param productName The new Product Name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Updates the Unit Cost to the value passed as a parameter
     * @param unitCost The new unit cost for the product
     */
    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    /**
     * Updates the boolean indicating whether the product is in the current product line or not.
     * @param inCurrentProductLine Indicator that determines if the product is in the current product line or not.
     */
    public void setInCurrentProductLine(boolean inCurrentProductLine) {
        this.inCurrentProductLine = inCurrentProductLine;
    }

    /**
     * Builds a String representing a user friendly representation of the object state
     * @return Details of the specific product
     */
    public String toString()
    {
        return "Product description: " + productName
                + ", product code: " + productCode
                + ", unit cost: " + unitCost
                + ", currently in product line: " + inCurrentProductLine;
    }

}
