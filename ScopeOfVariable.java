package javaapplication2;

import java.util.Scanner;

import java.util.Scanner;
import static java.lang.Math.PI;

class Test {

    double PI = 3.142;

    void show() {
        System.out.println(PI);
    }
}

public class ScopeOfVariable {

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.show();
    }
}
