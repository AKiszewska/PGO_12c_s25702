package ĆW5;

public class Main{
    public static void main(String[] args) {


        Water w1 = new Water("Mentor", 2, 30, true);
        Alcohol a1 = new Alcohol("Walda", 70, 8, 45);
        Ore o1 = new Ore("Voltix", 30, 14, true);
        Crystal c1 = new Crystal("Falton", 300, 4, 12);
        Flower f1 = new Flower("Hunv", 40, 2);
        Plants p1 = new Plants("Manta", 8, 30);
        Plants p3 = new Plants("Tetri", 4, 10);
        Root r1 = new Root("Fanti", 3, 4);


        Elixir e1 = new Elixir("Untix");
        e1.setCatalyst(a1);
        e1.addIngredient(o1);
        e1.addIngredient(p1);
        e1.removeIngredient(o1);
        e1.addIngredient(p3);
        e1.addIngredient(c1);
        e1.Create();
        e1.print();

    }
}






