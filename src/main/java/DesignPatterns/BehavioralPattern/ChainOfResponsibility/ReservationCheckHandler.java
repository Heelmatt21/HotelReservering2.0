package DesignPatterns.BehavioralPattern.ChainOfResponsibility;

import java.util.Map;

public class ReservationCheckHandler extends Handler {

    @Override
    public boolean handle(String reservation, String date) {
        if ("Stark Tony".equals(reservation) && "01-03-2022".equals(date)) {
            System.out.println("Person has a reservation! ");
            return true;
        }
        if ("Romanoff Natasha".equals(reservation) && "02-03-2022".equals(date)) {
            System.out.println("Person has a reservation! ");
            return true;
        }
        if ("Rogers Steven".equals(reservation) && "02-03-2022".equals(date)) {
            System.out.println("Person has a reservation! ");
            return true;
        }
        System.out.println("No reservation found please check name and date");
        return handleNext(reservation, date);
    }
}
