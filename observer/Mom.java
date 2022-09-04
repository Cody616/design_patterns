package observer;

public class Mom implements Observer//two observers divided into mom and dad
{
    Baby baby;//uml vars
    public Mom(Baby baby)
    {
        this.baby = baby;
        baby.registerObserver(this);//registers to system the reaction the baby exhibits
    }
    public void update(Cry cry)//also three scenarios based on emotions of the baby 
    {
        switch(cry)
        {
         case ANGRY:
            System.out.println("Mom hugs " +  baby.getName() + ". ");
            baby.receiveLove();
            break;
        case HUNGRY:
            System.out.println("Mom feeds " + baby.getName() + ". ");
            baby.eat();
            break;
        case WET:
            System.out.println("Mom changes " + baby.getName() + ". ");
            baby.getChanged();
            break;
        }
    }
}
