import attractions.*;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ThemeParkTest {

    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollerCoaster;
    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private ParkingSpot parkingSpot;
    private TobaccoStall tobaccoStall;

    private Visitor visitor;

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewed;
    private ThemePark themePark;

    @Before
    public void before(){
       dodgems = new Dodgems("Bumper Cars", 5);
       park = new Park("Leafy Meadows", 9);
       playground = new Playground("Fun Zone", 7);
       rollerCoaster = new RollerCoaster("Blue Ridge", 10);
       candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 5);
       iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 5);
       tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 5);

       visitor = new Visitor(30, 1.5, 40.0);

       attractions = new ArrayList<>();
       attractions.add(dodgems);
       attractions.add(park);
       attractions.add(playground);
       attractions.add(rollerCoaster);

       stalls = new ArrayList<>();
       stalls.add(candyflossStall);
       stalls.add(iceCreamStall);
       stalls.add(tobaccoStall);


       themePark = new ThemePark(attractions, stalls);
    }

    @Test
    public void canGetIReviewed(){
        ArrayList<IReviewed> result = themePark.getAllReviewed();
        assertNotNull(result);
    }

    @Test
    public void canAddAttractionToVisitorVisitedListAndIncrementsVisitCount(){
        themePark.visit(visitor, rollerCoaster);
        ArrayList<Attraction> visited = new ArrayList<>();
        visited.add(rollerCoaster);
        assertEquals(visited, visitor.getVisitedAttractions());
        assertEquals(1, rollerCoaster.getVisitCount());
    }



}
