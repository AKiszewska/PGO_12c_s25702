package ĆW7;
import java.util.ArrayList;

public class Character {

    String name;
    static Location location;
    private static ArrayList<String> character = new ArrayList<>();
    private static ArrayList<Character> target = new ArrayList<>();

    int health = 100;
    public Character(String name, Location location) {
        setName(name);
        setLocation(location);
        int health = 100;
        character.add(name);
    }

    public Character(String name) {
        setName(name);
    }

    public static void status() {
        System.out.println("====Status====");
        for (int i = 0; i < character.size(); i++) {
            System.out.println(character.get(i) + " : 100");
        }
        System.out.println("==============");
    }


    public void introduce() {
        System.out.println("Hello, I am " + name);
    }

    public static void MoveAllTo(Location location, Character first, Character secound) {
        first.location = location;
        secound.location = location;
    }

    public void moveTo(Location location){
        this.location = location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveTo(Orphanage woolsOrphanage) {
        setLocation(woolsOrphanage.getLocation());
    }

    public Location getLocation() {
        return location;
    }

    public void say(String s, Character character) {
        System.out.println(
                name + " to " + character.getName() + "\n" + s
        );
    }

    private String getName() {
        return name;
    }

    public void doSth(String s) {
        System.out.println(
                "I am " + getName() + ", I am " + s
        );
    }

    public static void doSth(String s, Character character1,Character character2, Character character3){
        character1.doSth(s);
        character2.doSth(s);
        character3.doSth(s);
    }

    public void addChild(Character character){
        character.setLocation(this.getLocation());
    }

    public void target(Character character) {
        target.add(character);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public static void castSpell(Spell s, Character character){
        int tmpHealth = 0;
        if (s == Spell.AvadaKedavra && (!character.getName().equals("Harry"))) {
            tmpHealth = 100;
        }else{
            character.setHealth(character.getHealth() - tmpHealth);
        }

    }

    public void castSpell(Spell s) {
        for (int i = 0; i < target.size(); i++) {

            castSpell(s, target.get(i));

            if(target.get(i).getHealth() > 0){
                System.out.println(target.get(i).getName()+" goes LOL...");
            } else {
                System.out.println(target.get(i).getName()+" died.");
            }
        }
    }
}
