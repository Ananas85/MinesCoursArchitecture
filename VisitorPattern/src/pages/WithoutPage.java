package pages;

import visiteur.Visitor;

/**
 * Cas de base du composite
 * et patron singleton
 * @author jcroyer
 *
 */
public class WithoutPage extends Pages {
	
	/**
	 * Le singleton pour les pages.
	 */
	public static WithoutPage EMPTY = new WithoutPage();
	
	/**
	 * Constructeur prive.
	 */
	private WithoutPage(){}

	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public boolean isSorted() {
		return true;
	}

	@Override
	public Pages insert(int p) {
		return this.add(p);
	}

	@Override
	public String toStringAux() {
		return "";
	}

	@Override
	public boolean find(int p) {
		return false;
	}

	@Override
	public int accept(Visitor v) {
		return v.visit(this);
	}

	@Override
	public Pages sort() {
		return EMPTY;
	}
}
