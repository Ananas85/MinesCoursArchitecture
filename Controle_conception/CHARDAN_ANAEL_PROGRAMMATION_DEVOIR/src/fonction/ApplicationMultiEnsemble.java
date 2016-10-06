package fonction;

import java.util.function.Function;

public class ApplicationMultiEnsemble<E> extends MultiEnsembleComposite<E> {
    protected Function<E, E> function;
    protected MultiEnsembleParesseux<E> support;

    public ApplicationMultiEnsemble( Function<E, E> function, MultiEnsembleParesseux<E> support ) {
        super( support.taille() );
        this.function = function;
        this.support = support;
    }

    @Override
    public E element() {
        //Plusieurs solutions
        return this.function.apply( this.support.element() );
    }

    @Override
    public MultiEnsembleParesseux<E> reste() {
        return new ApplicationMultiEnsemble<>( function, support.reste() );
    }

    @Override
    public boolean estApplication() {
        return true;
    }

    @Override
    public boolean estVide() {
        return support.estVide();
    }

    //Les getters
    public Function<E, E> function() {
        return function;
    }

    public MultiEnsembleParesseux<E> support() {
        return support;
    }
}
