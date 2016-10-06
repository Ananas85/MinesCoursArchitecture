package vocabulaire;

import java.util.Vector;

public class Verbe extends Mot {

    public final static Mot MANGER = new Verbe("manger");
    public final static Mot BOIRE = new Verbe("boire");
    public final static Mot DORMIR = new Verbe("dormir");
    public final static Mot FAIRE = new Verbe("faire");

    private Verbe(String n) {
        this.name = n;
    }

    public void setAll() {
        this.all = new Vector<Mot>();
        this.all.add(MANGER);
        this.all.add(BOIRE);
        this.all.add(FAIRE);
        this.all.add(DORMIR);
    }
}
