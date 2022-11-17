package Datenstrukturen.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addElement(5);
        ll.addElement(12);
        ll.addElement(22);
        ll.addElement(24);
        ll.addElement(44);
        System.out.println("Hello World");

        ll.removeElement(3);
        ll.display();
        System.out.println(ll.get(0));
    }

}
