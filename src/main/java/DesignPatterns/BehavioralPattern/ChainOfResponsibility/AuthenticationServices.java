package DesignPatterns.BehavioralPattern.ChainOfResponsibility;

public class AuthenticationServices {
    private Handler handler;
    public AuthenticationServices(Handler handler){
        this.handler = handler;
    }

    public boolean CheckReservation (String reservation, String date){
        if (handler.handle(reservation,date)) {
            System.out.println("Reservation check was successful");
            return true;
        }
        return false;
    }
}
