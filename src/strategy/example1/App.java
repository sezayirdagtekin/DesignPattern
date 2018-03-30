package strategy.example1;

/***
 * 
 * @author dagtekin
 *
 */
public class App {

  public static void main(String[] args) {

    Strategy foodStrategy = new FoodStrategy();
    Product apple = new Product(foodStrategy);
    apple.setName("Apple");
    apple.setCategory(Category.FOOD);
    apple.setPrice(20.0);

    Strategy furnitureStrategy = new FurnitureStrategy();
    Product table = new Product(furnitureStrategy);
    table.setName("Table");
    table.setCategory(Category.FURNITURE);
    table.setPrice(20.0);


    System.out.println(apple + " discount:" + foodStrategy.discount(apple) +" $");
    System.out.println(table + " discount:" + furnitureStrategy.discount(table)+" $");


  }

}
