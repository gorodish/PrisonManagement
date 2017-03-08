package example.codeclan.com.prisonmanagement;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/03/2017.
 */

public class TestPrisoner {

    private Prisoner prisoner1;
    private Prisoner prisoner2;
    private Prisoner prisoner3;
    private Prisoner prisoner4;
    private Prisoner prisoner5;
    Cell cell;
    private ArrayList<Prisoner> prisoners;

    @Before
    public void before() {
        prisoner1 = new Prisoner("Jodie 'Acid Bath' Garden", SecurityLevel.LOW, false);
        prisoner2 = new Prisoner("Daniel 'The Strangler' McDonald", SecurityLevel.LOW, true);
        prisoner3 = new Prisoner("Ryan 'Knuckles' Sinclair", SecurityLevel.LOW, true);
        prisoner4 = new Prisoner("Ellen 'Cat Burglar' Grafton", SecurityLevel.MEDIUM, false);
        prisoner5 = new Prisoner("Murray 'Fingers' McQuarrie", SecurityLevel.HIGH, true);
        cell = new Cell("The Exterminator", prisoners);
    }

    @Test
    public void canSpeak() {
        assertEquals("Hello...does anyone have a spoon?", prisoner1.speak());
    }

    @Test
    public void canFeedPrisoner() {
        cell.addPrisoners(prisoner2);
        cell.addPrisoners(prisoner1);
        cell.addPrisoners(prisoner3);
        cell.addPrisoners(prisoner4);
        cell.feedPrisoners();
        assertEquals(0, cell.getHungryPrisonerCount());
    }

    @Test
    public void testPrisonerIsHighRisk() {
        cell.addPrisoners(prisoner5);
        assertEquals(true, prisoner5.isHighRisk());
    }
}
