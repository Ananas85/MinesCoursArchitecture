package fonction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class ModuleMultiEnsemblesParesseux<E> implements ModuleMultiEnsembles<E, MultiEnsembleParesseux<E>> {

    private ModuleMultiEnsemblesParesseux() {

    }

    @Override
    public MultiEnsembleParesseux<E> vide() {
        return MultiEnsembleVide.singleton();
    }

    @Override
    public MultiEnsembleParesseux<E> cons( E element, MultiEnsembleParesseux<E> reste ) {
        return new MultiEnsembleCons<E>( element, reste );
    }

    @Override
    public MultiEnsembleParesseux<E> somme( MultiEnsembleParesseux<E> x, MultiEnsembleParesseux<E> y ) {
        return new MultiEnsembleSomme<E>( x, y );
    }

    @Override
    public int taille( MultiEnsembleParesseux<E> seq ) {
        return seq.taille();
    }

    @Override
    public MultiEnsembleParesseux<E> application( MultiEnsembleParesseux<E> seq, Function<E, E> f ) {
        if ( seq.estVide() ) {
            return vide();
        }

        if ( seq.estSomme() ) {
            return seq;
        }

        if ( seq.estApplication() ) {
            return new ApplicationMultiEnsemble<>( f.compose( seq.function() ), seq );
        }

        return new ApplicationMultiEnsemble<>( f, seq );
    }

    @Override
    public MultiEnsembleParesseux<E> filtrage( MultiEnsembleParesseux<E> seq, Predicate<E> pred ) {
        if ( seq.estVide() ) {
            return seq;
        }

        if ( seq.estSomme() ) {
            return somme( filtrage( seq.gauche(), pred ), filtrage( seq.droit(), pred ) );
        }

        if ( seq.estApplication() ) {
            return filtrage( seq.support(), i -> pred.test( seq.function().apply( i ) ) );
        }

        if ( pred.test( seq.element() ) ) {
            return cons( seq.element(), filtrage( seq.reste(), pred ) );
        }

        return filtrage( seq.reste(), pred );
    }

    @Override
    public boolean egal( MultiEnsembleParesseux<E> x, MultiEnsembleParesseux<E> y ) {
        Map<E, Integer> firstMap = new HashMap<>();
        Map<E, Integer> secondMap = new HashMap<>();


        while ( !x.estVide() ) {
            E element = x.element();
            int numberOccurences = firstMap.getOrDefault( element, 0 );
            firstMap.put( element, numberOccurences + 1 );
            x = x.reste();
        }
        while ( !y.estVide() ) {
            E element = y.element();
            int numberOccurences = secondMap.getOrDefault( element, 0 );
            secondMap.put( element, numberOccurences + 1 );
            y = y.reste();
        }
        return firstMap.equals( secondMap );

    }

    @Override
    public String representation( MultiEnsembleParesseux<E> x ) {
        String s = "{";
        while ( !x.estVide() ) {
            if ( x.reste().estVide() )
                s += x.element();
            else
                s += x.element() + ",";
            x = x.reste();
        }
        return s + "}";
    }

    //Sa agit comme une fabrique abstraite
    public static <E> ModuleMultiEnsembles<E, ?> abstraction() {
        return new ModuleMultiEnsemblesParesseux<>();
    }

    @Override
    public MultiEnsembleParesseux<E> zero() {
        return vide();
    }
}
