package fonction;

import java.util.function.Function;
import java.util.function.Predicate;

public interface ModuleFoncteurSequence<S, E> {
    int taille( S seq ); // Donne la taille de la séquence.

    S application( S seq, Function<E, E> f ); // Applique la fonction f à chaque élément de la séquence.

    S filtrage( S seq, Predicate<E> pred ); // Filtre chaque élément de la séquence suivant le prédicat pred.
}
