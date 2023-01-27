package Designpatterns.ObserverPattern;

public class MainClass {
    
    public static void main(String[] args) {
        SunCollector s1 = new SunCollector(19);
        Heater h1 = new Heater();
        ChargeController c1 = new ChargeController();
        s1.addToSunCollector(h1);
        s1.addToSunCollector(c1);
        if(s1.getVolt() >= 18){
            for (Observer observers: s1.getObservers()){
                observers.inform();

            }
        }
    }
}
