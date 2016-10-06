package vocabulary;

import java.util.Vector;

public class Autre extends Vocabulaire {

	// simulate enum
	public final static Vocabulaire BEAU = new Autre("beau");
	public final static Vocabulaire PAIN = new Autre("pain");
	public final static Vocabulaire EAU = new Autre("eau");
	public final static Vocabulaire FROID = new Autre("froid");

	private Autre(String n) {
		this.name = n;
	}

	public void setAll() {
		this.all = new Vector<Vocabulaire>();
		this.all.add(BEAU);
		this.all.add(PAIN);
		this.all.add(EAU);
		this.all.add(FROID);
	}

}
