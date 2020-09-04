
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
     * @return boolean, if element was able to be placed in the queue return true, otherwise false 
     */
    public boolean put(Object value) {
        if( first == null ) { // Queue i    s empty 
            first = new Node(value); // The element is both first and last element in the Queue 
            last = first; 
            return true; 
        } else { // Queue is not empty 
            last.next = new Node(value); // The last node points to the new node
            last = last.next;  // The new node is set as the last node. 
            return true; 
        }
        return false;
    }

    /**
     * This function removes one element from the queue and returns it. The next element is placed as first element in the queue. 
     * @return Node, the first node in the Queue 
     */
    public Node poll() {
        if ( first == null ) {
            return null; 
        } else {
            Node temp = first; // Grab the first element 
            first = first.next; // Switch the first element to the next one 
            return temp; // Return the first element 
        }
    }

    /**
     * This function returns the first element in the Queue. 
     * @return Node, the first node in the Queue. 
     */
    public Node peek() {
        if ( first == null ) {  // Queue is empty 
            return null; // return null 
        } else { // Not empty Queue 
            return first; // Return the first element 
        }
    }

    /**
     * This returns the size of the Queue using a iteration. 
     * @return int, the size of the queue. 
     */
    public int getSize() {
        int size = 0;
        if ( first == null ) { // Queue is empty 
            return size; // return 0 
        } else {
            Node temp = first; // Grab the first element
            while(temp.next != null) { // Iterate through the Queue until the the pointer is null 
                size++;
                next = temp.next;
            }
        }
        return size;
    }
}