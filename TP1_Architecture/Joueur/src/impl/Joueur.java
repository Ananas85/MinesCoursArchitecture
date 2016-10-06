package impl;

import interfaces.ProvidedJoueur;

import java.util.concurrent.ThreadLocalRandom;

public class Joueur implements ProvidedJoueur {

    protected String nom;

    protected String prenom;

    public Joueur(String nom, String prenom){
        this.prenom = prenom;
        this.nom = nom;
    }
    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public String getPrenom() {
        return this.prenom;
    }

    @Override
    public int compter( int i ) {
        if (i >= 3)
            return i - ThreadLocalRandom.current().nextInt(1, 4);
        return i - 1;
    }

    @Override
    public void winner() {
        System.out.println(this.toString() + " est le gagnant");
    }

    @Override
    public String toString()
    {
        return this.nom + " " + this.prenom;
    }
}
