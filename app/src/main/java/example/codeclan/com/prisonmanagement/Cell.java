package example.codeclan.com.prisonmanagement;

import java.util.ArrayList;

/**
 * Created by user on 04/03/2017.
 */

public class Cell {

    private ArrayList<Prisoner> prisoners;

    public Cell() {
        prisoners = new ArrayList<Prisoner>();
    }

    feedPrisoners() {
        for(prisoner in prisoners) {
            prisoner.eat();
        }
    }

    addPrisoners() {

    }

    removePrisoners() {

    }
}
