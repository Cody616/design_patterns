package factory;

/**
 * Cody Tang @author
 * grocery store class
 */
public class GroceryStore 
{
    /*
     * creation of a new cerealclass for different types
     */
    public Cereal createCereal(String version)
    {
        if(version.equalsIgnoreCase("Frosted Flakes"))
        {
            return new FrostedFlakes();
        }
        if(version.equalsIgnoreCase("Lucky Charsm"))
        {
            return new LuckyCharms();
        }
        if(version.equalsIgnoreCase("Fruit Loops"))
        {
            return new FruitLoops();
        }
        else
        {
            return " ";
        }
    }
}   
