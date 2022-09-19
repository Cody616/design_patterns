/*
*  Cody Tang @author
 * class extending cereal fruit loops
 */
package factory;
public class FruitLoops extends Cereal
{
    /*
     * sets all informatino for Fruit Loops
     */
    public FruitLoops()
    {
        super("FruitLoops", 1.89);
        toys.add("Tiny Car");
        toys.add("Silly Putty");
        toys.add ("Bat man ring");
        toys.add("Paw patrol Stickser");
        
    }

    /* 
     * details of the process of preperation for the cereal
    */
    public String prepare()
    {
        return super.prepare() + "\tGather the grain\nShape into circles\nrandomly color cirlces\nlet circles dry";
    }
}