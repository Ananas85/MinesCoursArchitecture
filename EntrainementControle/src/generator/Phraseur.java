package generator;

import data.phrase.FinPhrase;
import data.phrase.IPhrase;
import data.texte.Texte;
import data.texte.TexteNonVide;
import iterateur.Iterator;

/**
 * Exemple du phraseur : iterateur de phrase
 * utilisant un pointeur sur le texte.
 * Solution la plus simple
 * @author jcroyer
 *
 */
public class Phraseur implements Iterator<IPhrase>{

	/**
	 * Generateur interne.
	 */
	protected GenererTexte inter;

	/**
	 * Pointer to the current sentence.
	 */
	protected Texte current;

	public Phraseur() {
		this.inter = new GenererTexte();
		this.first();
		System.out.println(this.inter.getLetexte());
	}

	@Override
	public void first() {
		// resetting the pointer
		this.current = this.inter.getLetexte();
	}

	@Override
	public IPhrase current() {
		if (this.current.size() == 0) {
			return FinPhrase.nulle;
		}

		return ((TexteNonVide) this.current).getPremier();

	}

	@Override
	public boolean isDone() {
		return (this.current.size() == 0);
	}

	@Override
	public void next() {
		this.current = ((TexteNonVide) this.current).getSuite();
	}

}
