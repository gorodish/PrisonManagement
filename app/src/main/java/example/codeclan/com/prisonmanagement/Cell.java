package example.codeclan.com.prisonmanagement;

import java.util.ArrayList;

/**
 * Created by user on 04/03/2017.
 */

public class Cell {

    private String name;
    private ArrayList<Prisoner> prisoners;

    public Cell(String name, ArrayList<Prisoner> prisoners) {
        this.name = name;
        this.prisoners = new ArrayList<Prisoner>();

    }

    public int countPrisoners() {
        return this.prisoners.size();
    }

    public void addPrisoners(Prisoner prisoner) {
        this.prisoners.add(prisoner);
    }

    public void removePrisoners() {
        this.prisoners.remove(0);
    }

    private void feedPrisoners() {
        for(Prisoner prisoner : prisoners) {
            prisoner.eat();
        }
    }
}

