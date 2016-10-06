package fonction;

public class MultiEnsembleCons<E> extends MultiEnsembleComposite<E> {
    protected E element;
    MultiEnsembleParesseux<E> reste;

    public MultiEnsembleCons( E element, MultiEnsembleParesseux<E> reste ) {
        super( 1 + reste.taille() );
        this.element = element;
        this.reste = reste;
    }

    public E element() {
        return element;
    }

    public MultiEnsembleParesseux<E> reste() {
        return reste;
    }
}
