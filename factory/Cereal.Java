/**
 * Cody Tang @author
 * cereal class
 */
package factory;
 import java.util.Random;
 import java.util.ArrayList;

 public abstract class Cereal
 {
    protected ArrayList<String> toys = new ArrayList<String>();
    protected String name;
    protected double price;
 

 /*
  * initializing the paramaters of the name and price in the Cereal class
  */
 public Cereal(String name, double price)
 {
    this.name = name;
    this.price = price;
 }

 /*
  * returns a string of a cereal kind of like a tostring
  */
  public String prepare()
  {
    return "Prepping the " + name ;
  }

  /*
   * returns a string of information regarding the boxxed cereal
     also allows for a toy selection randomyl chosen
   */
  public String boxCereal()
  {
    Random var = new Random();
    int test = var.nextInt(toys.size());

    return "Boxing the :" + name + "in the box snf adding the random toy " + toys.get(num)
  }

  /*
   * returns a string with the name and price of the cereal given
   */
  public String priceCereal()
  {
    return "Putting the pricw tag of $" + price + "on the " + name + " box"
  }
}