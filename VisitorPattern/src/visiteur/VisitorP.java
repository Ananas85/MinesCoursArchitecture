package visiteur;

import pages.WithPage;

/**
 * Visiteur pour trouver le nb de mots en page 2.
 * @author jcroyer
 *
 */
public class VisitorP extends Visitor2 {
	
	protected int page;
	
	/**
	 * @param p
	 */
	public VisitorP(int p) {
		this.page = p;
	}

	@Override
	public int visit(WithPage wi) {
		if (wi.getFirst() == this.page) {
			return 1+ wi.getRest().accept(this);
		} else {
			return wi.getRest().accept(this);	
		}
	}

}
