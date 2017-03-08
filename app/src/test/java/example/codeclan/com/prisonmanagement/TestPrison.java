package example.codeclan.com.prisonmanagement;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/03/2017.
 */

public class TestPrison {

    Prison prison1;
    Prison prison2;
    private ArrayList<Cell> cells;
    Cell cell1;
    Cell cell2;
    Cell cell3;
    Cell cell4;
    Cell cell5;
    private ArrayList<Prisoner> prisoners;
    Prisoner prisoner1;
    Prisoner prisoner2;
    Prisoner prisoner3;
    Prisoner prisoner4;

    @Before
    public void before() {
        prison1 = new Prison("Wits End", cells);
        prison2 = new Prison("Bleak Towers", cells);
        cell1 = new Cell("The Exterminator", prisoners);
        cell2 = new Cell("The Black Hole", prisoners);
        cell3 = new Cell("Brick View", prisoners);
        cell4 = new Cell("The Exterminator", prisoners);
        cell5 = new Cell("The Clink", prisoners);
        prison1.addCell(cell1);
        prison1.addCell(cell2);
        prison1.addCell(cell3);
        prison2.addCell(cell4);

    }

    @Test
    public void testPrisonName() {
        assertEquals("Wits End", prison1.name);
    }

    @Test
    public void testAddCell() {
        prison1.addCell(cell5);
        assertEquals(4, prison1.countCells());
    }

    @Test
    public void testRemoveCell() {
        prison1.removeCell();
        assertEquals(2, prison1.countCells());
    }

    @Test
    public void testTransferPrisoner() {

    }
}
