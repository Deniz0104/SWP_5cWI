package Designpatterns.FactoryPattern;


public class Ant extends AbstractActor {

    public Ant(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("My name is " + this.name + ". I am an: " + getClass().getSimpleName());
    }
}
