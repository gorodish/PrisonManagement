package example.codeclan.com.prisonmanagement;

/**
 * Created by user on 04/03/2017.
 */

public class Prisoner extends Person {


    private String name;
    private SecurityLevel securityLevel;

    public Prisoner (String name, SecurityLevel securityLevel) {
        this.name = name;
        this.securityLevel = securityLevel;
    }

    public String speak() {
        return super.speak() + "does anyone have a spoon?";
    }

    public String getName() {
        return this.name;
    }

//    Prison prison;
//
//    Boolean isHungry = false;
//
//    eat() {
//        isHungry = false;
//    }
//
//
//    prison.feedPrisoners()
//
//
//    }


}
