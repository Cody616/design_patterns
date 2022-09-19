import java.util.ArrayList;

public class Cereal{

    protected String name;
    protected double price;
    protected ArrayList<String> toys = new ArrayList<String>();

    /*
     * Creates a Cereal object.
     */
    public Cereal(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    /**
     * returns a string of which cereal is being prepared.
     */
    public String prepare()
    {
        //System.out.println("Preparing " + this.name);
        return "Preparing " + name;
    }

    /**
     * returns a string of what occurrs when boxing the cereal depending on which kind of cereal it is.
     */
    public String boxCereal()
    {
        int index = (int)(Math.random() * toys.size());
        if(this.name == "Frosted Flakes")
        {
           return "Boxing the Frosted Flakes"+ 
             "\n\t- Drawing fun pictures of Frosted Flakes on the box" + 
             "\n\t- Pouring the Frosted Flakes into the box" + 
             "\n\t- Adding the suprise " + toys.get(index);

        }
        if(this.name == "Fruit Loops")
        {
            return "Boxing the Fruit Loops"+ 
             "\n\t- Drawing fun pictures of Fruit Loops on the box" + 
             "\n\t- Pouring the Fruit Loops into the box" + 
             "\n\t- Adding the suprise " + toys.get(index);
        }
        if(this.name == "Lucky Charms")
        {
            return "Boxing the Lucky Charms"+ 
             "\n\t- Drawing fun pictures of Lucky Charms on the box" + 
             "\n\t- Pouring the Lucky Charms into the box" + 
             "\n\t- Adding the suprise " + toys.get(index);
        }
        return "";
    }

    /**
     * returns a string of the price of the cereal depending on which kind of cereal it is.
     */
    public String priceCereal()
    {
        if(this.name == "Frosted Flakes")
        {
            return "Putting the price tag of $2.99 on the Frosted Flakes box";
        }
        if(this.name == "Fruit Loops")
        {
            return "Putting the price tag of $1.89 on the Fruit Loops box";
        }
        if(this.name == "Lucky Charms")
        {
            return "Putting the price tag of $1.55 on the Lucky Charms box";
        }
        return "";
    }
    
}