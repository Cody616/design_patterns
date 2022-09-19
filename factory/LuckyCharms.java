/*
    Cody Tang @author
 * class extending cereal Lucky Charms
 */
package factory;
public class LuckyCharms extends Cereal
{
    /*
     * sets all informatino for lucky charms
     */
    public LuckyCharms()
    {
        super("LuckyCharms", 1.55);
        toys.add("Tiny truck");
        toys.add("Play doe");
        toys.add ("Elsa Ring");
        toys.add("My little pony stickers");
        
    }

    /* 
     * details of the process of preperation for the cereal
    */
    public String prepare()
    {
        return super.prepare() + "\tGather the grain\nShape into X's and O's\n Create marshmallow shapes\n mix the grain and marshmallows";
    }
}