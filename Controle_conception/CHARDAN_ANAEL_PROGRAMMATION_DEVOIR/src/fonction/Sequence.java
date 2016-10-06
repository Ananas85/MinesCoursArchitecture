package fonction;

public interface Sequence<S, E> {
    int taille(); // Donne la taille de la séquence.

    boolean estVide(); // Teste la vacuité.

    E element(); // Renvoie un élément si la séquence n'est pas vide.

    S reste(); // Renvoie le reste de la séquence si elle n'est pas vide.

}
