package Designpatterns.DogExample;

public class Wuff implements BarkStrategy{
    @Override
    public void bark() {
        System.out.println("Wuff");
    }
}
