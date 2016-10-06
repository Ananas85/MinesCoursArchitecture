package data.phrase;

import vocabulary.Vocabulaire;

/**
 * Classe pour la fin de phrase.
 * @author jcroyer
 *
 */
public class FinPhrase extends Phrase {

	public static final FinPhrase nulle = new FinPhrase();

	@Override
	public int size() {
		return 0;
	}

	public String toString() {
		return ".";
	}

	@Override
	public boolean isPaul() {
		return false;
	}

	@Override
	public boolean isPierreEau() {
		return false;
	}

	@Override
	public boolean contient(Vocabulaire voc) {
		return false;
	}

}
