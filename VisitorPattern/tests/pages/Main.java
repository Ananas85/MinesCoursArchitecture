package pages;

import visiteur.Visitor;
import visiteur.Visitor2;
import visiteur.VisitorP;


/**
 * @author jcroyer
 *
 */
public class Main {
	
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		try {
			Pages ex = WithoutPage.EMPTY.add(2).add(3).add(6).add(1);
			System.out.println(" : " + ex);
			System.out.println(" : " + ex.isSorted());
			
			Pages ex1 = WithoutPage.EMPTY.add(6).add(3).add(1);
			System.out.println(" : " + ex1);
			System.out.println(" : " + ex1.isSorted());
			
				
			System.out.println(" insert 0 : " + ex1.insert(0) + " ? " + ex1.insert(0).isSorted());
			System.out.println(" insert 1 : " + ex1.insert(0).insert(1) 
					+ " ? " + ex1.insert(0).insert(1).isSorted());
			System.out.println(" insert 4 : " + ex1.insert(0).insert(1).insert(4)
					+ " ? " + ex1.insert(0).insert(1).insert(4).isSorted());
			System.out.println(" insert 7 : " + ex1.insert(0).insert(1).insert(4).insert(7)
					+ " ? " + ex1.insert(0).insert(1).insert(4).insert(7).isSorted());

			
			System.out.println(" insert 2 : " + WithoutPage.EMPTY.insert(2) 
					+ " ? " + WithoutPage.EMPTY.insert(2).isSorted());
			
			System.out.println(" insert 3 : " + WithoutPage.EMPTY.insert(2).insert(3) 
					+ " ? " + WithoutPage.EMPTY.insert(2).insert(3).isSorted());
			
			System.out.println("ex1 =" + ex1);
			
			Pages ex3 = ex1.insert(0).insert(1).insert(4).insert(7);
			
			System.out.println("ex3 =" + ex3 + " TRI =" + ex3.sort());
					
	
			Visitor v2 = new Visitor2();
			System.out.println("visitor2 = " + ex3.accept(v2));
			
			Visitor vp = new VisitorP(0);
			System.out.println("visitor  = " + ex3.accept(vp));
			
			
			
		} catch (PageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
