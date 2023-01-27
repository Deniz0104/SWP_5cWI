package Designpatterns.FactoryPattern;

public abstract class AbstractActor implements Actor{
    protected String name;

    public AbstractActor(String name) {
        this.name = name;
    }
}
