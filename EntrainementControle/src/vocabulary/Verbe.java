package vocabulary;

import java.util.Vector;

public class Verbe  extends Vocabulaire {

	// simulate enum
	public final static Vocabulaire MANGER = new Verbe("manger");
	public final static Vocabulaire BOIRE = new Verbe("boire");
	public final static Vocabulaire DORMIR = new Verbe("dormir");
	public final static Vocabulaire FAIRE = new Verbe("faire");

	private Verbe(String n) {
		this.name = n;
	}

	public void setAll() {
		this.all = new Vector<Vocabulaire>();
		this.all.add(MANGER);
		this.all.add(BOIRE);
		this.all.add(FAIRE);
		this.all.add(DORMIR);
	}

}
