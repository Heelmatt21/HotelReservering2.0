package DesignPatterns.CreationalPattern.BuilderPattern;

public class HotelEmployee {
    private KamerBuilder kamerBuilder;

    public void setKamerBuilder(KamerBuilder kamerBuilder){
        this.kamerBuilder = kamerBuilder;
    }

    public KamerBuilder getKamerBuilder(){
        return kamerBuilder;
    }

    public Kamer getKamer(){
        return kamerBuilder.getKamer();
    }

    public void constructKamer(){
        kamerBuilder.createNewKamer();
        kamerBuilder.buildComfort();
        kamerBuilder.buildFeatures();
    }
}
