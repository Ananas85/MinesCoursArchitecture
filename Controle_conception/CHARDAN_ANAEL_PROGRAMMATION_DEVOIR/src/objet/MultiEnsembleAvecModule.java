package objet;

import fonction.ModuleMultiEnsembles;
import fonction.Sequence;

import java.util.function.Function;
import java.util.function.Predicate;

public class MultiEnsembleAvecModule<E, Rep extends Sequence<Rep, E>> implements MultiEnsemble<E> {
    private ModuleMultiEnsembles<E, Rep> module;
    private Rep multiEnsemble;

    public MultiEnsembleAvecModule( ModuleMultiEnsembles<E, Rep> module, Rep multiEnsemble ) {
        this.module = module;
        this.multiEnsemble = multiEnsemble;
    }

    private Rep concretiser( MultiEnsemble<E> seq ) {
        if ( seq.estVide() )
            return module.vide();

        return module.cons( seq.element(), concretiser( seq.reste() ) );
    }

    private MultiEnsemble<E> fabriquer( Rep multiEnsemble ) {
        return new MultiEnsembleAvecModule<>( module, multiEnsemble );
    }

    @Override
    public String toString() {
        return module.representation( multiEnsemble );
    }

    @Override
    public MultiEnsemble<E> vide() {
        return fabriquer( module.vide() );
    }

    @Override
    public MultiEnsemble<E> cons( E element, MultiEnsemble<E> reste ) {
        return fabriquer( module.cons( element, this.concretiser( reste ) ) );
    }

    @Override
    public MultiEnsemble<E> somme( MultiEnsemble<E> x ) {
        return fabriquer( module.somme( multiEnsemble, concretiser( x ) ) );
    }

    @Override
    public MultiEnsemble<E> application( Function<E, E> f ) {
        return fabriquer( module.application( multiEnsemble, f ) );
    }

    @Override
    public MultiEnsemble<E> filtrage( Predicate<E> pred ) {
        return fabriquer( module.filtrage( multiEnsemble, pred ) );
    }

    @Override
    public int taille() {
        return multiEnsemble.taille();
    }

    @Override
    public boolean estVide() {
        return multiEnsemble.estVide();
    }

    @Override
    public E element() {
        return multiEnsemble.element();
    }

    @Override
    public MultiEnsemble<E> reste() {
        return fabriquer( multiEnsemble.reste() );
    }

    @Override
    public MultiEnsemble<E> zero() {
        return vide();
    }
}
