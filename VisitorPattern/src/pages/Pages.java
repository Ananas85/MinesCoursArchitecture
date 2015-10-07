package pages;

import visiteur.Visitor;

/**
 * Racine du composite pour les pages.
 * @author jcroyer
 *
 */
public abstract class Pages {

	/**
	 * Teste la suite vide.
	 * @return empty or not
	 */
	public abstract boolean isEmpty();
	
	/**
	 * Ajoute une page en tete.
	 * @param p
	 * @return a new list
	 */
	public WithPage add(int p) {
		return new WithPage(p, this);
	}
	
	/**
	 * to string.
	 */
	public  String toString() {
		return "[" + this.toStringAux() + "]";
	}
	
	/**
	 * Auxilliaire.
	 * @return a string
	 */
	public abstract String toStringAux();
	
	/**
	 * Predicat de tri des pages.
	 * @return sorted or not
	 * @throws PageException 
	 */
	public abstract boolean isSorted() throws PageException;
	
	/**
	 * Insere et preserve le tri.
	 * @param p the page
	 * @return a new list 
	 */
	public abstract Pages insert(int p);
	
	/**
	 * Tri par insertion.
	 * @return a soterd list
	 */
	public abstract Pages sort();
	
	/**
	 * Cherche si p est dans la liste.
	 * @param p
	 * @return find or not
	 */
	public abstract boolean find(int p) ;

	/**
	 * accepte les visit.
	 * @param v
	 * @return an int 
	 */
	public abstract int accept(Visitor v);
}
