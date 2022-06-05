package ĆW5;

public class Flower extends Plants{

    public Flower(String name, int baseReagent) {
        super(name, baseReagent);
    }

    public Flower(String name, int baseReagent, int toxity) {
        super(name, baseReagent, toxity);
    }

    public int getReagent(){
        return (super.getReagent() * 2);
    }
}
