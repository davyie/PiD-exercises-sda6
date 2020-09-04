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
    int size; // Optional solution to solving the size assignment 
    /**
     * Default constructor to create an empty list.
     */
    public LinkedList() {
        first = null;
        size = 0; // Optional solution to solving the size assignment 
    }

    /**
     * Add an integer element to the list.
     *
     * @param elem The element to be added.
     */
    public void add(int elem) {
        if (first == null) {
            // this means the list is empty!
            // handle the simple case
            Node n = new Node(elem, null);
            first = n;
            
        } else {
            // first != null
            // handle the more tricky case

            // 1. step: find last node!
            // The last node is the node where
            // next == null!
            Node current = first;
            while (current.next != null) { // is it the last node?
                current = current.next;
            }
            // here, we know: current is the last node
            // because current.next == null
            Node last = current;
            last.next = new Node(elem, null);
        }
        size++; //Optional solution to solving the size assignment 
    }

    /**
     * Return the integer element at the given index.
     *
     * @param index the index of the element to be returned.
     * @return the element at the given index.
     */
    public int get(int index) {
        // 2 cases
        if (first == null) { // list is empty
            // case 1: zero elements
            throw new IndexOutOfBoundsException("list is empty");
        } else {
            // case 2: at least one element
            int counter = 0;
            Node current = first;
            // can use "next" field
            while (current.next != null && counter < index) {
                current = current.next;
                counter++;
            }
            if (counter == index) {
                return current.elem;
            } else {
                throw new IndexOutOfBoundsException("index out of bounds");
            }

        }
    }

     /**
     * This function searches for a specific value in the data structure. 
     * @param value, an integer value that we want search for. 
     * @return boolean, if the value is found the return true otherwise false. 
     */
    public boolean search(int value) {
        // TODO: Assignment 2 
        boolean isFound = false;
        Node currentNode = first; // Current node is the first node 

        // Iterate through the chain with while loop 
        // This finds the first occurrance of the value. 
        // Remember that multiple elements can have the same value. 
        while(first.next != null) {    
            if ( currentNode.elem == value ) // If the value is correct then we have found the element. 
                isFound = true; // Mark as found 
            else
                currentNode = currentNode.next; // Go to next node 
        }
        return isFound; // Return the marking. 
    }

    /**
     * This function returns the number of data points in the data structure. 
     * 
     * @return int, the size of the data structure. 
     */
    public int size() {
        // TODO: Assignment 4
        Node current = first; // Start at the first node. 
        int size = 0;
        while (current != null) { // After reaching a null we are done with the loop 
            size++;
            current = current.next;
        }
        return size;
    }

    /**
     * Optional solution to solving the size assignment 
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * This function removes a data point at a given index. 
     * @param index, index of the data points we want to remove. 
     * @return boolean, if remove operation was successful return true, otherwise false. 
     */
    public boolean remove(int index) {
        // TODO: Assignment 5
        Node previous = first;
        Node current = previous.next; 
        int pos = 0;
        int size = size();
        boolean isDelete = false;

        while(current != null && index <= size) {
            if ( size == 1 && index == 1 ) {
                first = null; // Delete the first element 
            } else if ( pos == index ) {
                previous.next = current.next;
                isDelete = true;
                break;
            } else {
                previous = current;
                current = current.next;
                pos++; // Move to next position 
            }
        }
        if ( isDelete ) {size--;}
        return isDelete;
    }
}
