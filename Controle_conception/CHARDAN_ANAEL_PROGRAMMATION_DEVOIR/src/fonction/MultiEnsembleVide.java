package fonction;

public final class MultiEnsembleVide extends MultiEnsembleComposite {

    public static MultiEnsembleParesseux<?> constant = new MultiEnsembleVide();

    private MultiEnsembleVide() {
        super( 0 );
    }

    @SuppressWarnings("unchecked")
    public static <E> MultiEnsembleParesseux<E> singleton() {
        return ( MultiEnsembleParesseux<E> ) constant;
    }

}
