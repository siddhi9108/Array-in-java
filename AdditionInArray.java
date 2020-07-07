package javaapplication2;

import java.util.Scanner;

public class AdditionInArray {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int i, sum = 0;
        int[] arr = new int[5];
        System.out.println("Enter Array Items...");
        for (i = 0; i < 5; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.println("Your Array...");
        for (i = 0; i < 5; i++) {
            sum = sum = arr[i];
        }
        System.out.println("Sum is" + sum);
    }

}
