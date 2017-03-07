package example.codeclan.com.prisonmanagement;

import java.util.ArrayList;

/**
 * Created by user on 04/03/2017.
 */

public class Cell {

    private String name;
    private ArrayList<Prisoner> prisoners;
    private int count = 0;

    public Cell(String name) {
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

    public void feedPrisoners() {
        for(Prisoner prisoner : prisoners) {
            prisoner.eat();
        }
    }

    public int getHungryPrisonerCount() {
        int count = 0;
        for(Prisoner prisoner : prisoners) {
            if(prisoner.isHungry()) {
                count ++ ;
            }
        }
        return count;
    }
}

