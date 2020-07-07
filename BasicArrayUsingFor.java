package javaapplication2;

import java.util.Scanner;

public class BasicArrayUsingFor {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int i;
        int[] arr = new int[5];
        System.out.println("Enter Array Items...");
        for (i = 0; i < 5; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.println("Your Array...");
        for (i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

}
