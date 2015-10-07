package visiteur;

import pages.WithPage;
import pages.WithoutPage;

/**
 * Visiteur pour trouver le nb de mots en page 2.
 * @author jcroyer
 *
 */
public class Visitor2 extends Visitor {

	@Override
	public int visit(WithoutPage whi) {
		return 0;
	}

	@Override
	public int visit(WithPage wi) {
		if (wi.getFirst() == 2) {
			return 1+ wi.getRest().accept(this);
		} else {
			return wi.getRest().accept(this);	
		}
	}

}
