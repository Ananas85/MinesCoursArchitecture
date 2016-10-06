package data.phrase;

import vocabulary.Vocabulaire;

public interface IPhrase {

	/**
	 * Taille de la phrase.
	 * @return
	 */
	public int size();

	public String toString();

	/**
	 * Check if the sentence is meaningful.
	 * @return
	 */
	public boolean meaningful();

	/**
	 * Teste si PAUL est en premier.
	 * @return
	 */
	public boolean isPaul();

	/**
	 * Teste si PIERRE est premier et EAU dedans.
	 * @return
	 */
	public boolean isPierreEau();

	public boolean contient(Vocabulaire voc);

}
