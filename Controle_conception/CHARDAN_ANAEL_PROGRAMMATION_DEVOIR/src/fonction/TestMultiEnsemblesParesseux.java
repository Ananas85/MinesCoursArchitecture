package fonction;

/*
import java.util.function.Function;
import java.util.function.Predicate;
*/

import java.util.function.Function;
import java.util.function.Predicate;

public class TestMultiEnsemblesParesseux {

    public static <L extends Sequence<L, String>> void lancer( ModuleMultiEnsembles<String, L> m ) {
        L vide = m.vide();
        L a = m.cons( "a", vide );
        L ba = m.cons( "b", a );
        System.out.println( "{} ? " + m.representation( m.zero() ) );
        L baa = m.somme( ba, a );
        //On construit une somme
        System.out.println( "{b, a, a} ? " + m.representation( baa ) );
        System.out.println( "ba = ba ? " + m.egal( ba, ba ) );
        System.out.println( "ba = a ? " + m.egal( ba, a ) );
        System.out.println( "vide = ba ? " + m.egal( vide, ba ) );
        System.out.println( "vide = vide ? " + m.egal( vide, vide ) );
        Function<String, String> d = s -> s + s;
        System.out.println( "{bb, aa} ? " + m.representation( m.application( ba, d ) ) );
        Function<String, String> c = s -> "h";
        System.out.println( "{hh, hh} ? " + m.representation( m.application( m.application( ba, c ), d ) ) );
        System.out.println( "{h, h} ? " + m.representation(
                m.application( m.application( ba, d ), c ) ) );
        Predicate<String> pred = (x -> x.equals( "a" ) ? false : true);
        System.out.println( "{b} ? " + m.representation( m.filtrage( baa, pred ) ) );
    }

    public static void main( String[] args ) {
        ModuleMultiEnsembles<String, ?> m = ModuleMultiEnsemblesParesseux.abstraction();
        lancer( m );
    }

}
