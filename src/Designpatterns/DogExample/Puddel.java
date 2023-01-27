package Designpatterns.DogExample;

public class Puddel extends AbstractDog {


    public Puddel(String name, int age, BarkStrategy barkStrategy) {
        super(name, age, barkStrategy);
    }

    @Override
    public void run() {
        System.out.println("I am Puddel. My name is " + this.name);
        this.barkStrategy.bark();

    }

}
