package DesignPatterns.BehavioralPattern.ChainOfResponsibility;

public class ReservationExistHandler  extends  Handler {
    private Database database;

    public ReservationExistHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String reservation, String date) {
        if (!database.isValidReservation(reservation)) {
            return false;
        }
        return handleNext(reservation, date);
    }
}