package fonction;

public interface FabriqueSequences<S, E> {
    S vide(); // Crée une séquence vide.

    S cons( E element, S reste ); // Crée une séquence à partir d'un élément et d'une séquence.
}
