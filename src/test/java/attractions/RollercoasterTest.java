package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorAdult;
    Visitor visitorKid;

    @Before
    public void setUp() {
        visitorAdult = new Visitor(30, 1.5, 40.0);
        visitorKid = new Visitor(11, 1.2, 40.0);

        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void tooSmol(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitorKid));
    }

    @Test
    public void tooYoung(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitorKid));
    }

    @Test
    public void isOkay(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitorAdult));
    }

}
