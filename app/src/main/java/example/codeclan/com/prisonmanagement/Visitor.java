package example.codeclan.com.prisonmanagement;

/**
 * Created by user on 04/03/2017.
 */

public class Visitor extends Person implements Leaveable {

    private String name;

    public Visitor(String name) {
        this.name = name;
    }

    public String speak() {
        return super.speak() + "anyone seen my wallet?";
    }

    public String getName() {
        return this.name;
    }


}
