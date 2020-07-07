package javaapplication2;

import java.util.Scanner;

public class BasicArray {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int i;
        int[] arr = new int[5];
        System.out.println("Enter Array Items...");
        arr[0] = ob.nextInt();
        arr[1] = ob.nextInt();
        arr[2] = ob.nextInt();
        arr[3] = ob.nextInt();
        arr[4] = ob.nextInt();
        System.out.println("Your Array...");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }

}
