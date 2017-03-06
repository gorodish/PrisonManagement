package example.codeclan.com.prisonmanagement;

/**
 * Created by user on 04/03/2017.
 */

public class Prisoner extends Person {


    private String name;
    private SecurityLevel securityLevel;
    private boolean isHungry;

    public Prisoner (String name, SecurityLevel securityLevel, Boolean isHungry) {
        this.name = name;
        this.securityLevel = securityLevel;
        this.isHungry = true;

    }

    public String speak() {
        return super.speak() + "does anyone have a spoon?";
    }

    public String getName() {
        return this.name;
    }

    public void eat() {
        this.isHungry = false;
    }
}
