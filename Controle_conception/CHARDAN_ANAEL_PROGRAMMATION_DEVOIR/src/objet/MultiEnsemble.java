package objet;

import fonction.FabriqueSequences;
import fonction.Sequence;
import structuresAlgebriques.objet.MonoideAdditif;

public interface MultiEnsemble<E>
        extends Sequence<MultiEnsemble<E>, E>,
        FabriqueSequences<MultiEnsemble<E>, E>,
        FoncteurSequence<MultiEnsemble<E>, E>,
        MonoideAdditif<MultiEnsemble<E>> {
}
