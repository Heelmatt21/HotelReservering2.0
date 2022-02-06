package DesignPatterns.StructuralPattern.Facade;

import DesignPatterns.StructuralPattern.Airco.Cooler;
import DesignPatterns.StructuralPattern.Airco.Fan;
import DesignPatterns.StructuralPattern.Airco.Heating;

public class AircoFacade {
    private Fan fan = new Fan();
    private Heating heating = new Heating();
    private Cooler cooler = new Cooler();

    public void turnOnAirco(String airco){
        System.out.println("Turning airco on...");
        fan.off();
        heating.off();
        cooler.on();
        cooler.mediuw();

        System.out.println("Airco is on");
        System.out.println("\n");
    }

    public void turnOffAirco(){
        System.out.println("Turining airco off...");
        fan.off();
        heating.off();
        cooler.off();

        System.out.println("Airco is off");
    }
}
