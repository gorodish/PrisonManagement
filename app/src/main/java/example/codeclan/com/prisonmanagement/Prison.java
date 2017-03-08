package example.codeclan.com.prisonmanagement;

import android.renderscript.ScriptIntrinsicYuvToRGB;

import java.util.ArrayList;

/**
 * Created by user on 04/03/2017.
 */

public class Prison {

    public String name;
    private ArrayList<Cell> cells;
    private Cell cell;

    public Prison(String name, ArrayList<Cell> cells) {
        this.name = name;
        this.cells = new ArrayList<Cell>();
    }

    public String getName() {
        return this.name;
    }

    public int countCells() {
        return this.cells.size();
    }

    public void addCell(Cell cell) {
        this.cells.add(cell);
    }

    public void removeCell() {
        this.cells.remove(0);
    }

//    public Prisoner transferPrisoner() {
//        Prisoner prisoner = cell.removePrisoners();
//        return prisoner;
//    }
}
