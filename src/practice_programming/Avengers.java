package practice_programming;

public class Avengers {

    public String name;
    public String power;
    public String costume;
    public String weapon;

    public static String universe = "Marvel";

    public Avengers() {
    super();
    };

    public Avengers(String name, String power) {
        this.name = name;
        this.power = power;

    }

    public Avengers(String name, String power, String weapon) {
        this(name, power);
        this.weapon = weapon;

    }

    public Avengers(String name, String power, String weapon, String costume) {
        this(name, power, weapon);
        this.costume = costume;

    }




}
