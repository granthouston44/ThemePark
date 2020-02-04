package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitorKid;
    Visitor visitorAdult;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitorAdult = new Visitor(30, 1.2, 40.0);
        visitorKid = new Visitor(14, 1.2, 40.0);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void tooOld(){

        assertEquals(false, playground.isAllowedTo(visitorAdult));
    }

    @Test
    public void isAgeAppropriate(){
        assertEquals(true, playground.isAllowedTo(visitorKid));
    }
}
