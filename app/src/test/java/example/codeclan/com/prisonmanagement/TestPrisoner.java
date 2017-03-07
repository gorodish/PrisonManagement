package example.codeclan.com.prisonmanagement;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/03/2017.
 */

public class TestPrisoner {

    private Prison prison;
    Prisoner prisoner1;
    Prisoner prisoner2;
    Prisoner prisoner3;
    Prisoner prisoner4;
    Cell cell;

    @Before
    public void before() {
        prisoner1 = new Prisoner("Jodie 'Acid Bath' Garden", SecurityLevel.LOW, false);
        prisoner2 = new Prisoner("Daniel 'The Strangler' McDonald", SecurityLevel.LOW, true);
        prisoner3 = new Prisoner("Ryan 'Knuckles' Sinclair", SecurityLevel.LOW, true);
        prisoner4 = new Prisoner("Ellen 'Cat Burglar' Grafton", SecurityLevel.MEDIUM, false);
        cell = new Cell("The Exterminator");
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
}
