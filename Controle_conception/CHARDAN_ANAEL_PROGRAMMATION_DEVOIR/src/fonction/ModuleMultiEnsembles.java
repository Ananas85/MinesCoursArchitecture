package fonction;

import structuresAlgebriques.fonction.ModuleMonoideAdditif;


public interface ModuleMultiEnsembles<E, Rep extends Sequence<Rep, E>>
        extends FabriqueSequences<Rep, E>,
        ModuleFoncteurSequence<Rep, E>,
        ModuleMonoideAdditif<Rep> {
    boolean egal( Rep x, Rep y );

    String representation( Rep x );

}
