package data.texte;

import data.phrase.IPhrase;

public interface ITexte {

    public int size();

    /**
     * Get a fixed i
     *
     * @param i
     * @return
     */
    public IPhrase get(int i);
}
