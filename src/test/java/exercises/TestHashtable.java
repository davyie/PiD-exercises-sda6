package exercises;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestHashtable {
    @Test
    public void testLookup() {
        Hashtable ht = new Hashtable();
        ht.insert("Chandler", 52);
        Integer num = (Integer) ht.lookup("Chandler");
        assertEquals(52, num.intValue());
    }
}
