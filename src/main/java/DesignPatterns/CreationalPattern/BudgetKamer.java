package DesignPatterns.CreationalPattern;

import java.util.ArrayList;
import java.util.Collections;

public class BudgetKamer extends KamerBuilder {
    public void buildComfort(){
        kamer.setComfort("1 Star");
    }

    public void buildFeatures(){
        ArrayList<String> features = new ArrayList<String>();
        Collections.addAll(features, "Bed", "Tv", "Douche", "Toilet", "Airco");
        kamer.setFeatures(features);
    }
}
