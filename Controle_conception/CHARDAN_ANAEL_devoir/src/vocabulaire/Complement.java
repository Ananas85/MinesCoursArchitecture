package vocabulaire;

import java.util.Vector;

public class Complement extends Mot {

    // simulate enum
    public final static Mot BEAU = new Complement("beau");
    public final static Mot PAIN = new Complement("pain");
    public final static Mot EAU = new Complement("eau");
    public final static Mot FROID = new Complement("froid");

    private Complement(String n) {
        this.name = n;
    }

    public void setAll() {
        this.all = new Vector<Mot>();
        this.all.add(BEAU);
        this.all.add(PAIN);
        this.all.add(EAU);
        this.all.add(FROID);
    }
}
