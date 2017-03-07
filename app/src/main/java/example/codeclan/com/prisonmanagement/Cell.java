package example.codeclan.com.prisonmanagement;

import java.util.ArrayList;

/**
 * Created by user on 04/03/2017.
 */

public class Cell {

    private String name;
    private ArrayList<Prisoner> prisoners;
    private int count = 0;
    private Prisoner prisoner;

    public Cell(String name) {
        this.name = name;
        this.prisoners = new ArrayList<Prisoner>();
    }

    public int countPrisoners() {
        return this.prisoners.size();
    }

    public String addPrisoners(Prisoner addedPrisoner) {
        if(this.countPrisoners() < 4 && !addedPrisoner.isHighRisk() ) {
            this.prisoners.add(addedPrisoner);
        }
        return "Limit reached";
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

