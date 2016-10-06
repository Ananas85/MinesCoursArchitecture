package data.phrase;

import vocabulary.Autre;
import vocabulary.Sujet;
import vocabulary.Verbe;
import vocabulary.Vocabulaire;

/**
 * TODO MIN ?
 * @author jcroyer
 *
 */
public class PhraseNonVide extends Phrase {

	/**
	 * Constants for the size.
	 */
	public final static int MIN_PHRASE_SIZE = 3;
	public final static int MAX_PHRASE_SIZE = 4;

	protected Vocabulaire premier;
	public Vocabulaire getPremier() {
		return premier;
	}

	public Phrase getSuite() {
		return suite;
	}

	protected Phrase suite;

	public PhraseNonVide(Vocabulaire p, Phrase s) throws PhraseTropLongue {
		if ( s.size() > MAX_PHRASE_SIZE -1 ) {
			throw new PhraseTropLongue();
		} else {
			this.premier = p;
			this.suite = s;
		}
	}

	@Override
	public int size() {
		return 1 + this.suite.size();
	}

	public String toString() {
		return " " + this.premier + this.suite.toString();
	}

	/**
	 * Check if the sentence is meaningful.
	 * TODO trop stricte!!!
	 * @return
	 */
	public boolean meaningful() {
		return this.size() >= 3 && ((this.premier instanceof Sujet) || (this.premier instanceof Autre)) && ((( PhraseNonVide ) this.suite).premier instanceof Verbe);
	}

	@Override
	public boolean isPaul() {
		return this.premier.equals(Sujet.PAUL);
	}

	@Override
	public boolean isPierreEau() {
		return this.premier.equals(Sujet.PIERRE) && this.contient(Autre.EAU);
	}

	public boolean contient(Vocabulaire voc) {
		return (this.premier.equals(voc)) || this.suite.contient(voc);
	}

}
