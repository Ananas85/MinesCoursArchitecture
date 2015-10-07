package pages;

import visiteur.Visitor;

/** 
 * Composite avec des pages.
 * @author jcroyer
 *
 */
public class WithPage extends Pages {
	
	/**
	 * Les attributs.
	 */
	protected int first;
	protected Pages rest;

	/**
	 * Les accesseurs.
	 * @return an int
	 */
	public int getFirst() {
		return first;
	}

	/**
	 * Get rest of list
	 * @return a list
	 */
	public Pages getRest() {
		return rest;
	}

	/**
	 * Le constructeur principal.
	 * @param p
	 * @param page
	 */
	public WithPage(int p, Pages page) {
		this.first = p;
		this.rest = page;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}
	
	/**
	 * Acces au second element si possible.
	 * ATTENTION ici traitement par exception obligatoire
	 * ou alors utiliser un int "bidon" mais moche
	 * @return an int
	 * @throws PageException 
	 */
	public int getSecond() throws PageException {
		if (this.getRest().isEmpty()) {
			throw new PageException();
		} else {
			// le cast est correct ici
			WithPage wp = (WithPage) this.getRest();
			return wp.getFirst();
		}
	}

	@Override
	public boolean isSorted() throws PageException {
		// TODO l'utilisation de getSecond est sure ici => exception jamais levee
		return this.rest.isEmpty()  
				|| (this.first < this.getSecond() && this.getRest().isSorted());
	}

	@Override
	public Pages insert(int p) {
		if (p == this.getFirst()) {
			return this;
		} else if (p < this.getFirst()) {
			return this.add(p);
		} else {
			return (this.getRest().insert(p)).add(this.getFirst());
		}
	}

	@Override
	public String toStringAux() {
		// TODO gerer mieux l'affichage de la derniere virgule
		return this.getFirst() + ", " + this.getRest().toStringAux();
	}

	@Override
	public boolean find(int p) {
		return (this.getFirst() == p) || (this.getRest().find(p));
	}

	@Override
	public int accept(Visitor v) {
		return v.visit(this);
	}

	@Override
	public Pages sort() {
		if (this.rest.isEmpty()) {
			return this;
		} else {
			return this.rest.sort().insert(this.first);
		}

	}
	
}
