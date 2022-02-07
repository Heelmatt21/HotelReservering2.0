package DesignPatterns.CreationalPattern;

public abstract class KamerBuilder {

    protected Kamer kamer;

    public Kamer getKamer(){
        return kamer;
    }

    public void createNewKamer(){
        kamer = new Kamer();
    }

    public abstract void buildComfort();
    public abstract void buildFeatures();
}
