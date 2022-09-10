package observer;

public interface Subject 
{
    //three different actions that are needing to be related to the Baby
    void registerObserver(Observer observer);
    void notifyObservers(Cry cry);
    void removeObserver (Observer observer);
    
}
