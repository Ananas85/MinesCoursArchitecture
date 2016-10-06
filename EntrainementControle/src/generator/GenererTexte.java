package generator;

import vocabulary.Autre;
import vocabulary.Sujet;
import vocabulary.Verbe;
import vocabulary.Vocabulaire;
import data.phrase.FinPhrase;
import data.phrase.IPhrase;
import data.phrase.Phrase;
import data.phrase.PhraseNonVide;
import data.phrase.PhraseTropLongue;
import data.texte.FinTexte;
import data.texte.TexteNonVide;
import data.texte.Texte;
import data.texte.TexteTropLong;

/**
 * Element interne ˆ Phraseur.
 * Genere le texte
 * @author jcroyer
 *
 */
public class GenererTexte {

	protected Texte letexte;

	public Texte getLetexte() {
		return letexte;
	}

	public GenererTexte () {
		// choisir la taille
		int size = this.choisirNumero(TexteNonVide.MIN_TEXTE_SIZE, TexteNonVide.MAX_TEXTE_SIZE);
		this.letexte = FinTexte.nulle;
		for (int i = 0; i < size; i++) {
			try {
				this.letexte = new TexteNonVide(this.genererPhrase(), this.letexte);
			} catch (TexteTropLong e) {
				// not triggered
				e.printStackTrace();
			}
		}
	}

	/**
	 * Generate a sentence.
	 * @return
	 */
	private IPhrase genererPhrase() {
		Phrase result = FinPhrase.nulle;
		// choisir la taille : entre [min .. max[
		int size = this.choisirNumero(PhraseNonVide.MIN_PHRASE_SIZE, PhraseNonVide.MAX_PHRASE_SIZE);
		for (int i = 0; i < size; i++) {
			try {
				result = new PhraseNonVide(this.choisirMot(), result);
			} catch (PhraseTropLongue e) {
				// TODO Auto-generated catch block
				// not triggered
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * To choose a token in the vocabulary.
	 * @return
	 */
	private Vocabulaire choisirMot() {
		int kind = this.choisirNumero(0, 3);
		if (kind==0) {
			return Sujet.PAUL.choose();
		} else if (kind==1) {
			return Verbe.MANGER.choose();
		} else {
			return Autre.BEAU.choose();
		}
	}

	/**
	 * To choose a  number [min .. max[
	 * @param s
	 * @return
	 */
	private int choisirNumero(int min, int max) {
		return min + (int) (Math.random() * (max-min));
	}

}
