
package prog6112ea2020q3;

/**
 *
 * @author linde
 */
public class Details {
    
    private String productID;
    private String productName;
    private String productPrice;
    
    public Details(String productID, String productName, String productPrice){
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    
     public String getProductID(){
        return this.productID;
    }
   
     public String getProductName(){
        return this.productName;
    }
      public String getProductPrice(){
        return this.productPrice;
      }
      
      public String toString(){
          return "ID: " + this.productID + "\n" +
                 "NAME: " + this.productName + "\n" +
                  "PRICE: " + " R "+ this.productPrice + "\n";
      }
}