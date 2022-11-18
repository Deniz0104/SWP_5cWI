package Datenstrukturen.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(100);
        q.enqueue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(5);
        q.dequeue();

        q.display();
    }
}
