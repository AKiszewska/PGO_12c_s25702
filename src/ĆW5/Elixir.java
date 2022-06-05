package ĆW5;
import java.util.ArrayList;
import java.util.List;

public class Elixir {
    private String name = "";
    private boolean isCreated = false;
    private final List<Ingredient> ingredients = new ArrayList<>();
    private Liquid catalyst = null;
    private int power = 0;

    public Elixir(String name) {
        setName(name);
    }

    public int getPower(){
        if(isCreated()){
            throw new RuntimeException("function not available");
        } else {
            return power;
        }
    }

    private void powerUpdate(){
        int power = 0;
        if(catalyst == null) {
            throw new RuntimeException("No catalysts");
        } else {
            if (ingredients.size() > 0) {
                for (Ingredient ingredient : ingredients) {
                    power += ingredient.getReagent();
                }
            }
            if(catalyst.getReagent() > 0){
                power = power / catalyst.getReagent();
            } else {
                power = 0;
            }
        }
        this.power = power;
    }

    public void print(){
        System.out.println("Elixir: "+getName()+", Ingredients: "+ingredients.size());
        for (Ingredient ingredient : ingredients) {
            System.out.print("- ");
            ingredient.print();
        }
        if(getCatalyst() == null){
            System.out.println("Attetion: No catalysts");
        } else {
            System.out.print("Catalyst: ");
            getCatalyst().print();
        }
        if(isCreated()){
            System.out.println("Elixir is created");
        } else {
            System.out.println("Elixir not created, current power: "+getPower());
        }
    }

    public void addIngredient(Ingredient o){
        if(!isCreated){
            ingredients.add(o);
            this.powerUpdate();
        } else {
            throw new RuntimeException("Function unavailable when Elixir was created");
        }
    }

    public void removeIngredient(Ingredient o){
        if(!isCreated){
            ingredients.remove(o);
            this.powerUpdate();
        } else {
            throw new RuntimeException("Function unavailable when Elixir was created");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new RuntimeException("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    public boolean isCreated() {
        return isCreated;
    }

    public Liquid getCatalyst() {
        return catalyst;
    }

    public void setCatalyst(Liquid catalyst) {
        if(isCreated()){
            throw new RuntimeException("Function unavailable when Elixir was created");
        } else {
            this.catalyst = catalyst;
            powerUpdate();
        }
    }

    public void Create(){
        if(isCreated()) {
            throw new RuntimeException("Function unavailable when Elixir was created");
        } else if(this.catalyst == null){
            throw new RuntimeException("Elixir must have catalyst");
        } else {
            powerUpdate();
            this.isCreated = true;
        }
    }
}

