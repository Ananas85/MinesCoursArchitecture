package vocabulary;

import java.util.Vector;

/**
 * Classe du vocabulaire.
 * @author jcroyer
 *
 */
public abstract class Vocabulaire {

	protected String name;

	public String getName() {
		return name;
	}

	/**
	 * Pour gere les mots-cles.
	 */
	protected Vector<Vocabulaire> all;

	public Vector<Vocabulaire> all() {
		return this.all;
	}

	/**
	 * Nombre de mots-cles.
	 * @return
	 */
	public int size() {
		return this.all.size();
	}

	/**
	 * Pour choisir un mot-cle.
	 * @return
	 */
	public Vocabulaire choose() {
		int i = (int) (Math.random() * this.all.size());
		return this.all().get(i);
	}

	public String toString() {
		return this.name;
	}

	/**
	 * Pour initialiser les mots-cles.
	 */
	public abstract void setAll();

	/**
	 * Egalite.
	 */
	public boolean equals(Object o) {
		return (o!=null) && (o instanceof Vocabulaire)
				&& (this.name.equals(((Vocabulaire) o).getName()));
	}

	/**
	 * Initialise toutes les listes de mots-cles.
	 */
	public static void init() {
		Sujet.PAUL.setAll();
		Verbe.MANGER.setAll();
		Autre.BEAU.setAll();
	}
}
