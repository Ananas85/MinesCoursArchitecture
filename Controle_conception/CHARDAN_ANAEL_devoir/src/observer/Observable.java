package observer;

import java.util.ArrayList;

/**
 * Classe observ
 */
public abstract class Observable {

    ArrayList<IObserver> observers;

    public Observable()
    {
        this.observers = new ArrayList<IObserver>();
    }

    public void addObserver(IObserver observer)
    {
        this.observers.add( observer );
    }

    public void removeObserver(IObserver observer)
    {
        this.observers.remove( observer );
    }

    public void notifyObserver()
    {
        for ( IObserver obs :
                this.observers ) {
            obs.update();
        }
    }
}
