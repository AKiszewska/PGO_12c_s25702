package ĆW1.Zad7;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę która ma wskazywać na wielkość figury");
        int n = scan.nextInt();
        while (n < 5 || n % 2 == 0) {
            System.out.println("Podana liczba jest nieprawidłowa, podaj liczbę większą od 5, która jest nieparzysta");
            n = scan.nextInt();
        }
        for (int i = 1; i <= n; i++ )
        {
            for (int j = 1 ; j <= n; j++ )
            {
                if (i == 1 || i == n || i == j ||
                        j == 1 || j == n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
