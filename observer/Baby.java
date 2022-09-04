package observer;
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
//needed imports to run design pattern


public class Baby implements Subject//baby is  a subject
{
    String name;
    //3 vars needed to complete wholatilty

    ArrayList<Observer> observers;


    Random rand;
    

    public Baby(String name)
    {
        rand = new Random();
        this.name = name;
        this.observers = new ArrayList<>();
        
    }
    public String getName()
    {
        return name;
    }
    public void receiveLove()
    {
        if(rand.nextBoolean())
        {
            System.out.println(this.name + "feels appreciated and loved");
        }
        else
        {
            System.out.println(this.name = " pushes everyone aways and criess");
        }
    }
    public void eat()
    {
        if(rand.nextBoolean())
        {
            System.out.println(this.name + " has a happy full tummy.");
        }
        else
        {
            System.out.println(this.name + " throws all his food all on the floor");
        }
    }
    public void getChanged()
    {
        System.out.println(this.name + " is having a diaper change.");
    }
    public void notifyObservers(Cry cry)
    {
        //needs to create a new iterator to continue notifiying observer
        Iterator<Observer> itTest = observers.iterator();
        while(itTest.hasNext())
        {
            itTest.next().update(cry);
        }
    }
    public void registerObserver(Observer observer)
    {
        if(!observers.contains(observer))
        {
            observers.add(observer);
        }
    }
    public void removeObserver(Observer observer)
    {
        if(observers.contains(observer))
        {
            observers.remove(observer);
        }
    }
    public void angryCry()
    {
        System.out.println("Waaaaaa! " + name + " is feeling abadoned and angry.");
    }
    public void hungryCry()
    {
        System.out.println("Neh Neh Neh! " + name + " is starving!");
        notifyObservers(Cry.HUNGRY);
    }
    public void wetCry()
    {
        System.out.println("Aaaaa! " + name + " is WET!");
        notifyObservers(Cry.WET);
    }
}

