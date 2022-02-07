package DesignPatterns.BehavioralPattern.ChainOfResponsibility;

public abstract class Handler {
    private Handler next;
    public Handler setNextHandler(Handler next){

        this.next= next;
        return next;
    }

    public abstract boolean handle (String reservation , String date);

    protected boolean handleNext(String reservation , String date){
        if (next==null){
            return true;
        }
        return next.handle(reservation, date);
    }
}
