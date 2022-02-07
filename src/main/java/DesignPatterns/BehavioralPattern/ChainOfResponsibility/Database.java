package DesignPatterns.BehavioralPattern.ChainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private final Map<String, String> reservations;
    public Database(){
        reservations = new HashMap<>();
        reservations.put("Stark Tony", "01-03-2022");
        reservations.put ("Romanoff Natasha", "02-03-2022");
        reservations.put("Rogers Steven", "02-03-2022");

    }

    public Boolean isValidReservation(String reservation){
        return reservations.containsKey(reservation);
    }
    public  Boolean isValidDate(String reservation,String date){
        return reservations.get(reservation).equals(date);
    }
}
