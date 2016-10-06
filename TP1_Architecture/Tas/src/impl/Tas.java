package impl;

import interfaces.IProvidedTas;

import java.util.Random;

public class Tas implements IProvidedTas {

    protected int tas;

    public Tas()
    {
        this.initialize();
    }

    @Override
    public int getTas()
    {
        return this.tas;
    }

    @Override
    public boolean encore() {
        return (this.tas > 0);
    }

    @Override
    public void initialize() {
        Random rand = new Random();
        this.tas = rand.nextInt((20 - 1) + 1) + 1;
    }

    @Override
    public void enlever(int i) {
        this.tas -= i;
    }
}
