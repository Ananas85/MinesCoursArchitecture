package vocabulary;

import java.util.Vector;

public class Sujet extends Vocabulaire {

	private Sujet(String n) {
		this.name = n;
	}

	// simulate enum
	public static final  Vocabulaire PAUL = new Sujet("Paul");
	public static final  Vocabulaire PIERRE = new Sujet("Pierre");
	public static final  Vocabulaire JE = new Sujet("Je");
	public static final  Vocabulaire TU = new Sujet("Tu");
	public static final  Vocabulaire IL = new Sujet("Il");

	public void setAll() {
		this.all = new Vector<Vocabulaire>();
		this.all.add(PAUL);
		this.all.add(PIERRE);
		this.all.add(JE);
		this.all.add(TU);
		this.all.add(IL);
	}

}
