package Designpatterns.FactoryPattern;

import java.util.Random;

public class Factory {

    public static Actor generate() {

        Random random = new Random();
        switch (random.nextInt(1)) {
            case 0: return new Ant("Ant: " + random.nextInt(100));
            case 1: return new Bee("Bee: " + random.nextInt(100));
            default: return new Ant("Ant: " + random.nextInt(100));
        }

    }
}
