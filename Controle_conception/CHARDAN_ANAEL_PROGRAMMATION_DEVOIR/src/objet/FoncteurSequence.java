package objet;

import java.util.function.Function;
import java.util.function.Predicate;

public interface FoncteurSequence<S, E> {
    int taille(); // Donne la taille de la séquence.

    S application( Function<E, E> f ); // Applique la fonction f à chaque élément de la séquence.

    S filtrage( Predicate<E> pred ); // Filtre chaque élément de la séquence suivant le prédicat pred.
}
