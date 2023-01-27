package Designpatterns.DogExample;

public class Main {
    public static void main(String[] args) {
        BarkStrategy b1 = new Wuff();
        BarkStrategy b2 = new Wuuuuuaaaff();
        Dog d1 = new Puddel("Löwe", 15, b1);
        Dog d2 = new Boxer("Maschine", 10, b2);
        d1.run();
        d2.run();
    }
}
