package data.phrase;

import vocabulary.Vocabulaire;

public abstract class Phrase implements IPhrase {

	/**
	 * Check if the sentence is meaningful.
	 * default is false.
	 * @return
	 */
	public boolean meaningful() {
		return false;
	}


}
