package observer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Baby implements Subject
{
    String name;
    
    ArrayList<Observer> observers;
    Random rand;

    public Baby(String name)
    {
        this.name = name;
        this.observers = new ArrayList<>();
        rand = new Random();
    }
    public String getName()
    {
        return name;
    }
    public void receiveLove()
    {
        if(rand.nextBoolean())
        {
            System.out.println(this.name + "feels loved and appreicated");
        }
        else
        {
            System.out.println(this.name = " pushes away and crys");
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
            System.out.println(this.name + " throws all his food on the floor");
        }
    }
    public void getChanged()
    {
        System.out.println(this.name + " is having a diaper change.");
    }
    public void notifyObservers(Cry cry)
    {
        Iterator<Observer> i = observers.iterator();
        while(i.hasNext())
        {
            i.next().update(cry);
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
        System.out.println("Waaaa! " + name + " is feeling abadoned and angry.");
    }
    public void hungryCry()
    {
        System.out.println("Neh Neh Neh! " + name + " is starving!!!");
        notifyObservers(Cry.HUNGRY);
    }
    public void wetCry()
    {
        System.out.println("AAAAA! " + name + " is WET!");
        notifyObservers(Cry.WET);
    }
}

