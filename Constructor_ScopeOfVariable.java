package javaapplication2;

import java.util.Scanner;

class Test {

    int i;

    Test(int i) {
        this.i = i;
    }

    void add() {
        System.out.println(i + i);
    }
}

public class Constructor_ScopeOfVariable {

    public static void main(String[] args) {
        Test t1 = new Test(10);
        t1.add();
    }
}
