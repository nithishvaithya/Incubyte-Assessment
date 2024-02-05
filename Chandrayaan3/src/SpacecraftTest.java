import org.junit.Test;
import static org.junit.Assert.*;

public class SpacecraftTest {

    @Test
    public void testMoveForward() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.moveForward();
        assertEquals(0, spacecraft.getX());
        assertEquals(1, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
    }

    @Test
    public void testMoveBackward() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.moveBackward();
        assertEquals(0, spacecraft.getX());
        assertEquals(-1, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
    }

    @Test
    public void testTurnLeft() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.turnLeft();
        assertEquals('W', spacecraft.getDirection());
    }

    @Test
    public void testTurnRight() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.turnRight();
        assertEquals('E', spacecraft.getDirection());
    }

    @Test
    public void testTurnUp() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.turnUp();
        assertEquals('U', spacecraft.getDirection());
    }

    @Test
    public void testTurnDown() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.turnDown();
        assertEquals('D', spacecraft.getDirection());
    }
}
