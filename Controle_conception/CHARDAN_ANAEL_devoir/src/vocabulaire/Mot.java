package vocabulaire;

import java.util.Vector;

public abstract class Mot {

    protected String name;

    protected Vector<Mot> all;

    public String getName() {
        return name;
    }

    public String toString()
    {
        return this.name;
    }

    /**
     * Pour initialiser les mots-cles.
     */
    public abstract void setAll();

    public static void init() {
        Sujet.PAUL.setAll();
        Verbe.MANGER.setAll();
        Complement.BEAU.setAll();
    }
}
