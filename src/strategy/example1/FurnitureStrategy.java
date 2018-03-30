package strategy.example1;
/**
 * 
 * @author dagtekin
 *
 */
public class FurnitureStrategy implements Strategy {

  @Override
  public double discount(Product product) {
        if(product.getCategory().equals(Category.FURNITURE)){
           return product.getPrice()*0.20;
        }
        return 0;
  }
  

}
