package Designpatterns.ObserverPattern;

public class ChargeController implements Observer{
    @Override
    public void inform() {
        System.out.println("Startet Laderegler");

    }
}
