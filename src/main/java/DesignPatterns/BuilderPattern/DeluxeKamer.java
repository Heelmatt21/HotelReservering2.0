package DesignPatterns.BuilderPattern;

import java.util.ArrayList;
import java.util.Collections;

public class DeluxeKamer extends KamerBuilder{
    public void buildComfort(){
        kamer.setComfort("5 Star");
    }

    public void buildFeatures(){
        ArrayList<String> features = new ArrayList<String>();
        Collections.addAll(features, "Bed", "Tv", "Douche", "Toilet", "Balkon", "Bankstel", "Wifi", "Airco, Jacuzzi");
        kamer.setFeatures(features);
    }

}
