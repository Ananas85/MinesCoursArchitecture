package fonction;

import java.util.function.Function;

public abstract class MultiEnsembleComposite<E> implements MultiEnsembleParesseux<E> {
    private int taille;

    //Le constructeur
    public MultiEnsembleComposite( int taille ) {
        this.taille = taille;
    }

    //Les selecteurs renverront faux
    @Override
    public boolean estApplication() {
        return false;
    }

    @Override
    public boolean estSomme() {
        return false;
    }

    @Override
    public boolean estVide() {
        return this.taille == 0;
    }

    //Destructeurs
    @Override
    public Function<E, E> function() {
        throw new UnsupportedOperationException();
    }

    @Override
    public MultiEnsembleParesseux<E> support() {
        throw new UnsupportedOperationException();
    }

    @Override
    public MultiEnsembleParesseux<E> gauche() {
        throw new UnsupportedOperationException();
    }

    @Override
    public MultiEnsembleParesseux<E> droit() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E element() {
        throw new UnsupportedOperationException();
    }

    @Override
    public MultiEnsembleParesseux<E> reste() {
        throw new UnsupportedOperationException();
    }

    //La methode taile renverra la valeur d'un attribut en lecture
    @Override
    public int taille() {
        return taille;
    }
}
