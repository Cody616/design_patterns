package observer;

import java.util.Random;
public class Dad implements Observer //two observers divided into mom and dad
{
    Baby baby;//uml vars
    Random rand;
    public Dad(Baby baby)
    {
        this.baby = baby;
        rand = new Random();
        baby.registerObserver(this);
    }
    public void update (Cry cry)
    {
        int option = rand.nextInt(3);
        switch (option)
        {
            case 0://three scenarios creating based on the three emotions that the baby exhibits
                System.out.println("Dad puts a pillow over his head");
                break;
            case 1: 
                System.out.println("Dad nudges mom");
                break;
            case 2:
                System.out.println("Dad screams ... aaaa");
                break;
        }
    }
}
