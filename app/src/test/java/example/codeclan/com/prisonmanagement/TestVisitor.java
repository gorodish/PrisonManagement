package example.codeclan.com.prisonmanagement;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/03/2017.
 */

public class TestVisitor {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor("Professor Plum");
    }

    @Test
    public void canSpeak() {
        assertEquals("Hello...anyone seen my wallet?", visitor.speak());
    }

    @Test
    public void hasName() {
        assertEquals("Professor Plum", visitor.getName());
    }
}
