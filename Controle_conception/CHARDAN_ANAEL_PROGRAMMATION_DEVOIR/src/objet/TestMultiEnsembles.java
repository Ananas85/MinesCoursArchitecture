package objet;


import fonction.FabriqueSequences;
import fonction.ModuleMultiEnsembles;
import fonction.ModuleMultiEnsemblesParesseux;

import java.util.function.Function;
import java.util.function.Predicate;

public class TestMultiEnsembles {
    public static void lancer( FabriqueSequences<MultiEnsemble<String>, String> fab ) {
        MultiEnsemble<String> vide = fab.vide();
        MultiEnsemble<String> a = fab.cons( "a", vide );
        MultiEnsemble<String> ba = fab.cons( "b", a );
        System.out.println( "{} ? " + ba.zero() );
        MultiEnsemble<String> baa = ba.somme( a );
        System.out.println( "{b, a, a} ? " + baa );
        Function<String, String> d = s -> (s + s);
        System.out.println( "{bb, aa} ? " + ba.application( d ) );
        Function<String, String> c = s -> "h";
        System.out.println( "{hh, hh} ? " + ba.application( c ).application( d ) );
        System.out.println( "{h, h} ? " + ba.application( d ).application( c ) );
        Predicate<String> pred = (x -> x.equals( "a" ) ? false : true);
        System.out.println( "{b} ? " + baa.filtrage( pred ) );
    }

    public static void main( String[] args ) {
        ModuleMultiEnsembles<String, ?> m = ModuleMultiEnsemblesParesseux.abstraction();
        FabriqueSequences<MultiEnsemble<String>, String> fab = fabrique( m );
        lancer( fab );
    }

    private static <Rep, E> FabriqueSequences<Rep, E> fabrique( ModuleMultiEnsembles<String, ?> m ) {
        return new MultiEnsembleAvecModule( m, ModuleMultiEnsemblesParesseux.abstraction().vide() );
    }

}
