package Datenstrukturen.List.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addElement(5);
        ll.addElement(12);
        ll.addElement(22);
        System.out.println("Hello World");
        ll.display();

        System.out.println(ll.get(1));
    }

}
