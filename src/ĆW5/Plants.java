package ĆW5;

public class Plants extends Ingredient{
    protected int toxity = 0;
    public Plants(String name, int baseReagent, int toxity) {
        super(name, baseReagent);
        setToxity(toxity);
    }

    public Plants(String name, int baseReagent) {
        super(name, baseReagent);
    }

    public int getToxity() {
        return toxity;
    }

    public void setToxity(int toxity) {
        if(toxity >= 0) {
            this.toxity = toxity;
        } else {
            throw new RuntimeException("Toxity must be greater than 0");
        }
    }

    public int getReagent(){
        if(getToxity() > 0) {
            return (super.getReagent() * getToxity());
        } else {
            return super.getReagent();
        }
    }
}
