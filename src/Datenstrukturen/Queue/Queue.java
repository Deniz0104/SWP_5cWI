package Datenstrukturen.Queue;

import Datenstrukturen.HTLQueue;
import Datenstrukturen.Node;

public class Queue implements HTLQueue {
    int length = 0;
    private Node first, last;


    @Override
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }
        last = newNode;
        length++;
    }

    @Override
    public int dequeue() {
        int temp = first.getValue();
        first = first.getNext();
        length--;
        return temp;
    }

    @Override
    public void display() {
        Node n = first;
        if (first == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue Output: ");
        System.out.print("( ");
        while (n.getNext() != null) {
            System.out.print(n.getValue() + ", ");
            n = n.getNext();
        }
        System.out.println(n.getValue()+ " )");
    }
}

