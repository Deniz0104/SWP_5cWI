package Designpatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class SunCollector {
    private int Volt;
    List<Observer> observers;

    public SunCollector(int Volt) {
        this.Volt = Volt;
        this.observers = new ArrayList();

    }
    public void addToSunCollector(Observer observer){
        observers.add(observer);
    };


    public int getVolt() {
        return Volt;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
