package example.codeclan.com.prisonmanagement;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/03/2017.
 */

public class TestPrison {
    Prison prison;

    @Before
    public void before() {
        prison = new Prison("Wits End");
    }

    @Test
    public void testPrisonName() {
        assertEquals("Wits End", prison.name);
    }
}
