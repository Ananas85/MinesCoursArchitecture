package visiteur;

import pages.WithPage;
import pages.WithoutPage;

/**
 * 	Visit pour chaque cas concret!.
 * @author jcroyer
 *
 */
public abstract class Visitor {
	
	/**
	 * @param whi
	 * @return an int
	 */
	public abstract int visit(WithoutPage whi);
	
	/**
	 * @param wi
	 * @return an int
	 */
	public abstract int visit(WithPage wi);

}
