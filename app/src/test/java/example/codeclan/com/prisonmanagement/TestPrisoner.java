package example.codeclan.com.prisonmanagement;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/03/2017.
 */

public class TestPrisoner {

    private Prisoner prisoner;

    @Before
    public void before() {
        prisoner = new Prisoner("Jodie 'Acid Bath' Garden", SecurityLevel.LOW, false);
    }

    @Test
    public void canSpeak() {
        assertEquals("Hello...does anyone have a spoon?", prisoner.speak());
    }

    @Test
    public void canFeedPrisoner() {

    }
}
