package registry;

import data.phrase.IPhrase;
import data.phrase.PhraseVide;
import generator.Gen;
import observer.Observable;

import java.util.Vector;

/**
 * Singleton qui va servir de sauvegarde de toute les phrases donne par les generateurs que l'on peut lui donner
 */
public class Store extends Observable {

    protected Gen gen;

    Vector<IPhrase> phrases;

    public static Store instance = new Store();

    private Store() {
        super();
        this.phrases = new Vector<IPhrase>();
    }

    public void setGen( Gen gen ) {
        this.gen = gen;
    }

    /**
     * Realise l'activite de sauvegarde
     */
    public void storageProccessor()
    {
        if ( this.gen != null )
        {
            this.gen.first();
            while ( !this.gen.isDone() )
            {
                phrases.add(gen.current());
                this.notifyObserver();
                gen.next();
            }
        }
    }

    public int getSize()
    {
        return this.phrases.size();
    }

    /**
     * Get a phrase
     */
    public IPhrase getPhrase(int i)
    {
        if (i > this.phrases.size() || i < 0)
        {
            return PhraseVide.nulle;
        }
        return this.phrases.get( i );
    }
}
