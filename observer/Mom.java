package observer;

public class Mom implements Observer
{
    Baby baby;
    public Mom(Baby baby)
    {
        this.baby = baby;
        baby.registerObserver(this);
    }
    public void update(Cry cry)
    {
        switch(cry)
        {
         case ANGRY:
            System.out.println("Mom hugs " +  baby.getName() + ".");
            baby.receiveLove();
            break;
        case HUNGRY:
            System.out.println("Mom feeds " + baby.getName() + ".");
            baby.eat();
            break;
        case WET:
            System.out.println("Mom changes " + baby.getName() + ".");
            baby.getChanged();
            break;
        }
    }
}
