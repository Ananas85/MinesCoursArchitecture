package fonction;

import java.util.function.Function;

public interface MultiEnsembleParesseux<E> extends Sequence<MultiEnsembleParesseux<E>, E> {

    //S'il est egale a un multiensemble
    boolean estApplication();

    //S'il est egale a une somme
    boolean estSomme();

    Function<E, E> function();

    MultiEnsembleParesseux<E> support();

    MultiEnsembleParesseux<E> gauche();

    MultiEnsembleParesseux<E> droit();
}
