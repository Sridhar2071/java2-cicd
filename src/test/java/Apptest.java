import org.junit.Test;
import static org.junit.Assert.*;

public class Apptest {

    @Test
    public void testAdd() {
        assertEquals(30, App.add(10, 20));
    }
}