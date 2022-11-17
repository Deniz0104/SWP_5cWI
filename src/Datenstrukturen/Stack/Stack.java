package Datenstrukturen.Stack;

import Datenstrukturen.HTLStack;
import Datenstrukturen.Node;

public class Stack implements HTLStack {
    private Node top;


    @Override
    public void push(int value) {
        Node node = new Node(value);
        node.setNext(top);
        top = node;
    }

    @Override
    public Node pop() {
        top = top.getNext();
        return top;
    }

    @Override
    public int peek() {
        return top.getValue();
    }

    @Override
    public void display() {
        Node n = top;
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack Output: ");
        while (n.getNext() != null) {
            System.out.println(n.getValue() + " ");
            n = n.getNext();
        }
        System.out.println(n.getValue());
    }
}



