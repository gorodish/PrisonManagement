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
    private ArrayList<Cell> cells;
    Cell cell1;
    Cell cell2;
    Cell cell3;
    Cell cell4;
    Cell cell5;
    Prisoner prisoner1;
    Prisoner prisoner2;
    Prisoner prisoner3;
    Prisoner prisoner4;

    @Before
    public void before() {
        cell1 = new Cell("The Exterminator");
        cell2 = new Cell("The Black Hole");
        cell3 = new Cell("Brick View");
        cell4 = new Cell("The Exterminator");
        cell5 = new Cell("The Clink");
        prison = new Prison("Wits End", cells);
        prison.addCell(cell1);
        prison.addCell(cell2);
        prison.addCell(cell3);
        prison.addCell(cell4);


        prisoner1 = new Prisoner("Murray 'Fingers' McQuarrie", SecurityLevel.HIGH, true);
        prisoner2 = new Prisoner("Daniel 'The Strangler' McDonald", SecurityLevel.LOW, true);
        prisoner3 = new Prisoner("Ryan 'Knuckles' Sinclair", SecurityLevel.LOW, true);
        prisoner4 = new Prisoner("Ellen 'Cat Burglar' Grafton", SecurityLevel.MEDIUM, false);

    }

    @Test
    public void testPrisonName() {
        assertEquals("Wits End", prison.name);
    }

    @Test
    public void testAddCell() {
//        prison.addCell(cell3);
        prison.addCell(cell5);
        assertEquals(5, prison.countCells());
    }

    @Test
    public void testRemoveCell() {
//        prison.addCell(cell1);
//        prison.addCell(cell2);
//        prison.addCell(cell3);
//        prison.addCell(cell4);
        prison.removeCell();
        assertEquals(3, prison.countCells());
    }
}
