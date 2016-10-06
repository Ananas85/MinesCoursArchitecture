package registry;

import observer.IObserver;

/**
 * Des clients qui peuvent savoir quand un phrase est sauvee
 */
public class Client implements IObserver {

    private final String name;
    protected Store store;

    public Client( Store store, String name ) {
        this.store = store;
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(" JE suis le client : " + this.name + " : Une phrase a ete ajoutee au Store il est de taille " + this.store.getSize());
        int randomIndex = ( int ) (Math.random() * (this.store.getSize() - 0));
        System.out.println("Une phrase au hasard " + this.store.getPhrase( randomIndex ));
    }
}
