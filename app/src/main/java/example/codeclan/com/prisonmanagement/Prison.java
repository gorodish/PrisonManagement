package example.codeclan.com.prisonmanagement;

import android.renderscript.ScriptIntrinsicYuvToRGB;

import java.util.ArrayList;

/**
 * Created by user on 04/03/2017.
 */

public class Prison {

    public String name;
    private ArrayList<Cell> cells = new ArrayList<Cell>();
    private Cell cell;

    public Prison(String name, ArrayList<Cell> cells) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void feedPrisoners(){
        for(Cell cell : cells) {
            cell.feedPrisoners();
        }
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
}
