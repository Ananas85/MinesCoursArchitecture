package vocabulaire;

import java.util.Vector;

public class Sujet extends Mot {

    private Sujet(String n) {
        this.name = n;
    }

    // simulate enum
    public static final  Mot PAUL = new Sujet("Paul");
    public static final  Mot PIERRE = new Sujet("Pierre");
    public static final  Mot JE = new Sujet("Je");
    public static final  Mot TU = new Sujet("Tu");
    public static final  Mot IL = new Sujet("Il");

    public void setAll() {
        this.all = new Vector<Mot>();
        this.all.add(PAUL);
        this.all.add(PIERRE);
        this.all.add(JE);
        this.all.add(TU);
        this.all.add(IL);
    }
}
