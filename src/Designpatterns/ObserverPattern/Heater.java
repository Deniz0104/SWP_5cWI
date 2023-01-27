package Designpatterns.ObserverPattern;


public class Heater implements Observer {

    @Override
    public void inform() {
        System.out.println("Startet Heizung");
    }
}
