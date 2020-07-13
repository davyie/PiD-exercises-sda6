class Node {
    int elem;
    Node next;

    Node(int elem, Node next) {
        this.elem = elem;
        this.next = next;
    }

    Node(int elem) {
        this.elem = elem;
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
        Node newNode = new Node(elem);

        if(top == null) {
            top = new Node(elem); // If the stack is empty then the first element is the top element 
        } else {
            Node temp = top; // Temporary variable to keep the top
            top = newNode; // Move the top pointer to latest node 
            top.next = temp; // Make the connection between top and new node 
        }
    }

    /**
     * Return the integer element at the given index.
     *
     * @param index the index of the element to be returned.
     * @return the element at the given index.
     */
    public int pop() {
        int value = 0;

        if (top == null) {
            return -1; // Returns a error message 
        } else {
            value = top.elem;
            top = top.next;
            return value;
        }
    }

    /**
     * This function returns the top elements value. 
     * @return int, the value of the top element
     */
    public int peek() {
        if (top == null) { // The stack is empty 
            return -1;
        } else {
            return top.elem; // The stack contains at least one element 
        }
    }

    /**
     * This function returns the number of data points in the data structure. 
     * 
     * @return int, the size of the data structure. 
     */
    public int size() {
        int size = 0;

        if (top == null) {
            return 0;
        } else {
            while (top.next != null) {
                top = top.next; 
                size++;
            }
        }
        return size;
    }
}
