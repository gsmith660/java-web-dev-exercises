package exercises.technology;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LaptopTest {

    @Test
    public void basicConstructor() {
        Laptop mac = new Laptop();
        assertEquals(100, mac.getBatteryLevel());
        assertEquals("World", mac.getUserName());
        assertEquals(42, mac.getUserIntegerInput());
    }

    @Test
    public void regularConstructor() {
        Laptop mac = new Laptop("Hal", 3);
        assertEquals(100, mac.getBatteryLevel());
        assertEquals("Hal", mac.getUserName());
        assertEquals(3, mac.getUserIntegerInput());
    }

    @Test
    public void batteryDrain() {
        Laptop mac = new Laptop("Hal", 3);
        mac.getUserName();
        assertEquals(99, mac.getBatteryLevel());
    }

}
