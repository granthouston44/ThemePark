package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitorAdult;
    Visitor visitorKid;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitorAdult = new Visitor(30, 1.5, 40.0);
        visitorKid = new Visitor(11, 1.2, 40.0);

    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void isChargedNormal(){
        assertEquals(4.50, dodgems.priceFor(visitorAdult), 0.1);
    }

    @Test
    public void yungDiscount(){
        assertEquals(2.25, dodgems.priceFor(visitorKid),0.1);
    }

}
