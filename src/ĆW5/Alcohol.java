package ĆW5;

public class Alcohol extends Liquid{
    protected int percent = 0;

    public Alcohol(String name, int baseReagent, int dissolubility, int percent) {
        super(name, baseReagent, dissolubility);
        setPercent(percent);
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        if(percent >= 0 && percent <= 100) {
            this.percent = percent;
        } else {
            throw new RuntimeException("Percent must be between 0 and 100");
        }
    }

    public int getReagent(){
        return super.getReagent() * getPercent();
    }

        }


