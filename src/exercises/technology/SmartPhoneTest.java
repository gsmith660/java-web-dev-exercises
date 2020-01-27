package exercises.technology;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SmartPhoneTest {
    SmartPhone lg;

    @Before
    public void initializePhone() {
        lg = new SmartPhone("Mobile Hal", 2);
    }

    @Test(expected = Exception.class)
    public void phoneHomeWhenOff() {
        lg.phoneHome();
        fail("Can't use phone when it's off!");
    }

    @Test
    public void phoneHomeWhenOn() {
        lg.powerButton();
        assertEquals("The number you are trying to call has been disconnected, Goodbye.", lg.phoneHome());
    }

    @Test
    public void calculateSquare() throws Exception {
        lg.powerButton();
        assertEquals(4, lg.computeSquare());
    }
}
