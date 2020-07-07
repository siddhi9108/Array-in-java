package javaapplication2;

import java.util.Scanner;

class Test {

    int i, j;

    Test() {
        i = 10;
        j = 20;
        System.out.println("Constructor called");
    }

    void add() {
        System.out.println(i + j);
    }
}

public class ConstructorWithoutArg {

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.add();

    }
}
