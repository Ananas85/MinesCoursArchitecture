package fonction;

public class MultiEnsembleSomme<E> extends MultiEnsembleComposite<E> {
    protected MultiEnsembleParesseux<E> gauche;
    protected MultiEnsembleParesseux<E> droit;

    public MultiEnsembleSomme( MultiEnsembleParesseux<E> gauche, MultiEnsembleParesseux<E> droit ) {
        super( gauche.taille() + droit.taille() );
        this.gauche = gauche;
        this.droit = droit;
    }

    @Override
    public boolean estSomme() {
        return true;
    }

    public MultiEnsembleParesseux<E> gauche() {
        return gauche;
    }

    public MultiEnsembleParesseux<E> droit() {
        return droit;
    }

    public E element() {
        if ( !gauche.estVide() ) return gauche.element();
        if ( !droit.estVide() ) return droit.element();
        throw new UnsupportedOperationException();
    }

    public MultiEnsembleParesseux<E> reste() {
        if ( !gauche.estVide() )
            return new MultiEnsembleSomme<E>( gauche.reste(), droit );
        if ( !droit.estVide() )
            return new MultiEnsembleSomme<E>( gauche, droit.reste() );
        return MultiEnsembleVide.singleton();
    }
}
