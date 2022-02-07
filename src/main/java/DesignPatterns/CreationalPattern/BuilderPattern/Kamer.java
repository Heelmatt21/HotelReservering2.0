package DesignPatterns.CreationalPattern.BuilderPattern;

import java.util.ArrayList;

public class Kamer {
    private String comfort = "";
    private ArrayList<String> features = new ArrayList<>();

    public void setComfort(String comfort){
        this.comfort=comfort;
    }
    public void setFeatures(ArrayList<String> features){
        this.features = features;
    }

    public String getComfort(){
        return comfort;
    }
    public ArrayList<String>getFeatures(){
        return features;
    }
}
