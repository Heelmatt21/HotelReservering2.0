package DesignPatterns.BehavioralPattern.ChainOfResponsibility;

public class ValidDateHandler extends Handler {
    private Database database;

    public ValidDateHandler(Database database) {
        this.database = database;

    }

    @Override
    public boolean handle(String reservation, String date) {
        if (!database.isValidDate(reservation, date)) {
            return false;
        }
        return handleNext(reservation, date);
    }
}