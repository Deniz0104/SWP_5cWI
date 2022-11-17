package Datenstrukturen.LinkedList;

import Datenstrukturen.HTLList;


public class LinkedList implements HTLList {
    private Node root;

    @Override
    public void addElement(int value) {
        Node n = new Node(value);
        if (root == null) {
            root = n;
        } else {
            Node actual = root;
            while (actual.getNext()!=null) {
                actual = actual.getNext();
            }
            actual.setNext(n);
        }
    }

    @Override
    public int get(int index) {
        Node currentNode = root;
        int counter = 0;

        while (currentNode!=null) {
            if (counter == index) {
                return currentNode.getValue();
            }
            counter++;
            currentNode = currentNode.getNext();
        }
        assert false;
        return currentNode.getValue();
    }

    @Override
    public void removeElement(int index) {
        Node actualNode = root;
        if (root == null) {
            return;
        }
        if (index == 0) {
            root = actualNode.getNext();
            return;
        }
        int counter = 0;
        while (actualNode.getNext()!=null) {
            if (counter == index) {
                actualNode.setValue(actualNode.getNext().getValue());
                actualNode = actualNode.getNext();
            }
            else {
                counter++;
            }
        }
    }

    @Override
    public void display() {
        Node actual = root;
        if(root == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Linked list Nodes Output: ");
        while(actual != null) {
            System.out.print(actual.getValue() + " ");
            actual = actual.getNext();
        }
        System.out.println();
    }
}
