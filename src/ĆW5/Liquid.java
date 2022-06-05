package ĆW5;

public class Liquid extends Ingredient {
    protected int dissolubility = 100;

    public Liquid(String name, int baseReagent, int dissolubility) {
        super(name, baseReagent);
        setDissolubility(dissolubility);
    }

    public int getDissolubility() {
        return dissolubility;
    }

    public void setDissolubility(int dissolubility) {
        if(dissolubility >= 0 && dissolubility <= 100) {
            this.dissolubility = dissolubility;
        } else {
            throw new RuntimeException("Dissolubility must be between 0 and 100 (%)");
        }
        this.dissolubility = dissolubility;
    }

    public int getReagent(){
        return (int) (super.getReagent()*getDissolubility()*0.01);
    }
}
