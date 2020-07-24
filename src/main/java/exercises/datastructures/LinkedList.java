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
public class LinkedList {
    Node first;

    /**
     * Default constructor to create an empty list.
     */
    public LinkedList() {
        first = null;
    }

    /**
     * Add an integer element to the list.
     *
     * @param elem The element to be added.
     */
    public void add(int elem) {
            // TODO: Assignment 1 
    }

    /**
     * This function searches for a specific value in the data structure. 
     * @param value, an integer value that we want search for. 
     * @return boolean, if the value is found the return true otherwise false. 
     */
    public boolean search(int value) {
        // TODO: Assignment 2 

        return -1;
    }

    /**
     * Return the integer element at the given index.
     *
     * @param index the index of the element to be returned.
     * @return the element at the given index.
     */
    public int get(int index) {
        // TODO: Assignment 3 - Function 1
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

    /**
     * This function removes a data point at a given index. 
     * @param index, index of the data points we want to remove. 
     * @return boolean, if remove operation was successful return true, otherwise false. 
     */
    public boolean remove(int index) {
        // TODO: Assignment 5
        return false;
    }
}
