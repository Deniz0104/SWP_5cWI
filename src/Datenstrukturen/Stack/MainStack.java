package Datenstrukturen.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(6);
        s.push(2);
        s.push(1);
        s.pop();
        s.display();
        System.out.println("Peek: " + s.peek());




    }
}
