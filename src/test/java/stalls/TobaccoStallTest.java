package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitorAdult;
    Visitor visitorKid;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 5);
        visitorAdult = new Visitor(30, 1.2, 40.0);
        visitorKid = new Visitor(14, 1.2, 40.0);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canUnderageSmoke(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitorKid));
    }

    @Test
    public void canAdultSmoke(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitorAdult));
    }
}
