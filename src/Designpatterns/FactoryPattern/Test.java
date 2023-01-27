package Designpatterns.FactoryPattern;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();

        for (var i = 0; i <= 20; i++) {
            actors.add(Factory.generate());
        }
        for (Actor actor: actors) {
            actor.sayHello();
        }

    }
}
