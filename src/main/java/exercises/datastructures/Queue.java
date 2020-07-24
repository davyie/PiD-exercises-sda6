
class Node {
    Object data; 
    Node next; 

    Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class Queue {
    Node first; 
    Node last;

    public Queue() {
        first = null;
        last = null;
    }

    /**
     * This function adds a data point to the queue. 
     * @return
     */
    public boolean put(Object value) {
        // TODO: Assignment 1 
        return false;
    }

    public Node poll() {
        // TODO: Assignment 2 
        return null; 
    }

    public Node peek() {
        // TODO: Assignment 3 
        return null;
    }

    public int getSize() {
        //TODO: Assignment 4 
        return -1;
    }
}