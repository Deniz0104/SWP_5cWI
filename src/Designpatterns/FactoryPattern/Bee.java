package Designpatterns.FactoryPattern;

public class Bee extends AbstractActor{
    public Bee(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("My name is " + this.name + ". I am a: " + getClass().getSimpleName());
    }
}
