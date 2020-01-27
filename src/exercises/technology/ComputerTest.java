package exercises.technology;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ComputerTest {
    Computer desktop;

    @Before
    public void createComputerObject() {
        desktop = new Computer("Hal", 6);
    }

    @Test(expected = Exception.class)
    public void runProgramWhenOff() {
        desktop.runProgram();
        fail("Shouldn't get here, since exception is thrown if computer is off");
    }

    @Test(expected = Exception.class)
    public void computeSquareWhenOff() throws Exception {
        desktop.computeSquare();
        fail("Shouldn't get here, since exception is thrown if computer is off");
    }

    @Test
    public void runProgramWhenOn() {
        desktop.powerButton();
        assertEquals("Hello Hal!", desktop.runProgram());
    }

}
