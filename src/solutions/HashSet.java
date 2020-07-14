/**
 * This is the example solution code for HashSet assignment. 
 * 
 * Author: SDA 
 * Date: 2020-01-15
 */

public class HashSet {

    private Object[] set; 
    private int size;

    // Constructor 
    public HashSet(int size) {
        set = new Object[size];
        this.size = size;
    }

    /**
     * This method is used to add element to the set.
     * @param elem, the element we want to add to the set 
     * @return true if the element was added correctly, otherwise false. 
     */
    public boolean add(Object elem) {
        // Calculate the hashcode 
        int hc = elem.hashCode();
        // Calculate the index 
        int index = hc % size;

        if ( set[index] != null ) {
            return false;
        } else {
            set[index] = elem;    
            return true;
        }
    }

    /**
     * This function checks whether an element exists in a set. 
     * @param elem, the element we want to check if it exists. 
     * @return true if the element exists in the set, otherwise false. 
     */
    public boolean exist(Object elem) {
        // Calculate hashcode
        int hc = elem.hashCode();
        // Calculate index with modulus
        int index = hc % size;
        
        return set[index] == elem ? true : false; // Tenary operator to check whether the index is null or not 
    }

    /**
     * This function removes given element in the set. 
     * @param elem, the element we want to remove. 
     * @return true if the element was deleted, otherwise false. 
     */
    public boolean remove(Object elem) {
        // Calculate hashcode 
        int hc = elem.hashCode();
        // Calculate index with modulus 
        int index = hc % size;

        if ( set[index] == elem ) {
            set[index] = null;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method returns the size of the set. 
     * @return
     */
    public int getSize() {
        return size;
    }
}