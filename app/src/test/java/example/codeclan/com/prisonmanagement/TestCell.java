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
    ArrayList<Prisoner> prisoners;

    @Before
    public void before() {
        prisoners = new ArrayList<Prisoner>();
        prisoner1 = new Prisoner("Murray 'Fingers' McQuarrie", SecurityLevel.HIGH);
        prisoner2 = new Prisoner("Daniel 'The Strangler' McDonald", SecurityLevel.LOW);
        prisoner3 = new Prisoner("Ryan 'Knuckles' Sinclair", SecurityLevel.LOW);
        prisoner4 = new Prisoner("Ellen 'Cat Burglar' Grafton", SecurityLevel.MEDIUM);
        cell = new Cell("Abandon Hope Cooler", prisoners);
    }

    @Test
    public void testCellEmpty() {
        assertEquals(0, cell.countPrisoners());
    }

    @Test
    public void testCanAddPrisoners() {
        cell.addPrisoners(prisoner2);
        cell.addPrisoners(prisoner1);
        cell.addPrisoners(prisoner3);
        cell.addPrisoners(prisoner4);
        assertEquals(4, cell.countPrisoners());
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
}
