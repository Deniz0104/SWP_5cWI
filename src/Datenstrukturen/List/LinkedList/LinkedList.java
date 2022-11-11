package Datenstrukturen.List.LinkedList;

import Datenstrukturen.List.HTLList;


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
        Node actualNode = root;
        int length = 0;
        return 0;
    }

    @Override
    public void removeElement(int index) {
        Node actualNode = root;
        for (int i = 0; i > index-1 ; i++) {

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
