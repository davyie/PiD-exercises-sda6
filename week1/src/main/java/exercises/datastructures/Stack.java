package exercises;

class Node {
    int elem;
    Node next;

    Node(int elem, Node next) {
        this.elem = elem;
        this.next = next;
    }
}

/**
 * This is an implementation of a simple linked list.
 * We have used it to practice data structures.
 */
public class Stack {
    private Node top; 

    /**
     * Default constructor to create an empty list.
     */
    public Stack() {
        top = null;
    }

    /**
     * Add an integer element to the list.
     *
     * @param elem The element to be added.
     */
    public void push(int elem) {
            // TODO: Assignment 1 
    }

    /**
     * Return the integer element at the given index.
     *
     * @param index the index of the element to be returned.
     * @return the element at the given index.
     */
    public int pop() {
        // TODO: Assignment 2
        return -1;
    }

    /**
     * This function returns the top elements value. 
     * @return int, the value of the top element
     */
    public int peek() {
        // TODO: Assignment 3
        return -1; 
    }

    /**
     * This function returns the number of data points in the data structure. 
     * 
     * @return int, the size of the data structure. 
     */
    public int size() {
        // TODO: Assignment 4
        return -1;
    }
}
