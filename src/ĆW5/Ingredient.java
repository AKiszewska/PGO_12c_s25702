package ĆW5;

public class Ingredient {
    protected String name;
    private int baseReagent = 0;

    public Ingredient(String name, int baseReagent) {
        setName(name);
        setBaseReagent(baseReagent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    protected int getReagent(){
        return baseReagent;
    }


    public void setBaseReagent(int baseReagent) {
        if (baseReagent >= 0) {
            this.baseReagent = baseReagent;
        } else {
            throw new RuntimeException("Base Reagent cannot be less than 0");
        }
    }

        public void print(){
            System.out.println(this.getName()+" (reagent: "+this.getReagent()+")");
        }
    }


