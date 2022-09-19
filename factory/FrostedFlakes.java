/*
*  Cody Tang @author
 * class extending cereal frosted flakes
 */
package factory;
public class FrostedFlakes extends Cereal
{
    /*
     * sets all informatino for lucky charms
     */
    public FrostedFlakes()
    {
        super("FrostedFlakes", 2.99);
        toys.add("Spider Man Tattoo");
        toys.add("Barbie Tattoo");
        toys.add ("Snap Bracelet");
        toys.add("Happy Feet Figure");
        
    }

    /* 
     * details of the process of preperation for the cereal
    */
    public String prepare()
    {
        return super.prepare() + "\tGather the grain\nShape into flakes\nsprinkle with frosting";
    }
}