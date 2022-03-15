package ĆW1.Zad6;
import java.util.Random;
import java.util.Arrays;

public class Zadanie6 {


    public static void main(String[] args) {
        int [] arr = new int [10];
        for (int i = 0; i < 10; i++) {
            arr [i] = randomBetween(100,1000);
        }

        System.out.println("Generated array: " + arrayToString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + arrayToString(arr));

    }

    static int randomBetween(int start, int end){
        Random random = new Random();
        int a1 = random.nextInt(end - start + 1);
        int a2 = a1 + start;
        return a2;
    }



    public static String arrayToString(int[] arr) {
        String napis = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                napis += '[';
                napis += arr[i];
            } else if (i == arr.length - 1) {
                napis += ',';
                napis += arr[i];
                napis += ']';
            } else {
                napis += ',';
                napis += arr[i];
            }
        }
        return napis;

    }

}


