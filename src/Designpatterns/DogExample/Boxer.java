package Designpatterns.DogExample;

public class Boxer extends AbstractDog {

    public Boxer(String name, int age,BarkStrategy barkStrategy) {
        super(name, age, barkStrategy);
    }

    @Override
    public void run() {
        System.out.println("I am a Boxer. My name ist " + this.name);
        this.barkStrategy.bark();
    }

}
