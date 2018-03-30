package strategy.example1;

/**
 * 
 * @author dagtekin
 *
 */
public class Product {

  private String           name;
  private Double           price;
  private Category  category;
  private Strategy strategy;


  public Product(Strategy strategy) {
    this.strategy = strategy;
  }

  public Category getCategory() {
    return category;
  }


  public void setCategory(Category category) {
    this.category = category;
  }


  public Strategy getStrategy() {
    return strategy;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Strategy strategy() {
    return strategy;
  }

  @Override
  public String toString() {
    return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
  }

}


enum Category {
  FOOD, FURNITURE;
}
