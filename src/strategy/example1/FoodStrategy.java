package strategy.example1;
/**
 * 
 * @author dagtekin
 *
 */
public class FoodStrategy implements Strategy {


  @Override
  public double discount(Product product) {
        if(product.getCategory().equals(Category.FOOD)){
           return product.getPrice()*0.10;
        }
        return 0;
  }
  
}
