package example.codeclan.com.prisonmanagement;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/03/2017.
 */

public class TestCell {

    Cell cell;
    Prisoner prisoner1;
    Prisoner prisoner2;
    Prisoner prisoner3;
    Prisoner prisoner4;
    Prisoner prisoner5;
    ArrayList<Prisoner> prisoners;

    @Before
    public void before() {
        prisoners = new ArrayList<Prisoner>();
        prisoner1 = new Prisoner("Murray 'Fingers' McQuarrie", SecurityLevel.HIGH, true);
        prisoner2 = new Prisoner("Daniel 'The Strangler' McDonald", SecurityLevel.LOW, true);
        prisoner3 = new Prisoner("Ryan 'Knuckles' Sinclair", SecurityLevel.LOW, true);
        prisoner4 = new Prisoner("Ellen 'Cat Burglar' Grafton", SecurityLevel.MEDIUM, false);
        prisoner5 = new Prisoner("Jodie 'Acid Bath' Garden", SecurityLevel.LOW, false);

        cell = new Cell("Abandon Hope Cooler");
    }

    @Test
    public void testCellEmpty() {
        assertEquals(0, cell.countPrisoners());
    }

    @Test
    public void testCanAddPrisoners() {
        cell.addPrisoners(prisoner2);
        cell.addPrisoners(prisoner3);
        cell.addPrisoners(prisoner4);
        cell.addPrisoners(prisoner5);
        assertEquals(4, cell.countPrisoners());
    }

    @Test
    public void testCannotAddHighRiskPrisoners() {
        cell.addPrisoners(prisoner2);
        cell.addPrisoners(prisoner1);
        cell.addPrisoners(prisoner3);
        cell.addPrisoners(prisoner4);
        assertEquals(3, cell.countPrisoners());
    }

    @Test
    public void testCanRemovePrisoners() {
        cell.addPrisoners(prisoner2);
        cell.addPrisoners(prisoner1);
        cell.addPrisoners(prisoner3);
        cell.addPrisoners(prisoner4);
        cell.removePrisoners();
        assertEquals(3, cell.countPrisoners());
    }

    @Test
    public void testCanFeedPrisoners() {
        cell.addPrisoners(prisoner1);
        cell.addPrisoners(prisoner2);
        cell.addPrisoners(prisoner3);
        cell.feedPrisoners();
        assertEquals(0, cell.getHungryPrisonerCount());
    }

    @Test
    public void testCellLimit() {
        cell.addPrisoners(prisoner2);
        cell.addPrisoners(prisoner1);
        cell.addPrisoners(prisoner3);
        cell.addPrisoners(prisoner4);
        cell.addPrisoners(prisoner5);
        assertEquals(4, cell.countPrisoners());
    }
}
