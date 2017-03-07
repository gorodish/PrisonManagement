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

    @Before
    public void before() {
        cell1 = new Cell("The Exterminator");
        cell2 = new Cell("The Black Hole");
        cell3 = new Cell("Brick View");
        cell4 = new Cell("The Exterminator");
        prison = new Prison("Wits End", cells);

    }

    @Test
    public void testPrisonName() {
        assertEquals("Wits End", prison.name);
    }

    @Test
    public void testAddCell() {
        prison.addCell(cell3);
        prison.addCell(cell1);
        assertEquals(2, prison.countCells());
    }

    @Test
    public void testRemoveCell() {
        prison.addCell(cell1);
        prison.addCell(cell2);
        prison.addCell(cell3);
        prison.addCell(cell4);
        prison.removeCell();
        assertEquals(3, prison.countCells());
    }
}
