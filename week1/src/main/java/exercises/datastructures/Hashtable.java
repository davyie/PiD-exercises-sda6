package exercises;

class Entry {
    Object key;
    Object value;
    Entry next;
    Entry(Object key, Object value, Entry next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}

public class Hashtable {
    private static final int SIZE = 1024;
    private Entry[] table = new Entry[SIZE];

    public void insert(Object key, Object value) {
        // TODO 
    }

    /**
     * Looks up the value associated with the given key,
     * or `null` if the key cannot be found.
     *
     * @param key The key to look up.
     * @return The value associated with the given key, or `null` if the key does not exist.
     */
    public Object lookup(Object key) {
        // TODO 
        return null;
    }
}
