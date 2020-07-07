package javaapplication2;

import java.util.Scanner;

import java.util.Scanner;
import static java.lang.Math.PI;

class Test {

    int i;
    static int j;

    Test() {
        i++;
        j++;
    }

    void show() {
        System.out.println(i);
        System.out.println(j);
    }
}

public class StaticKeyword {

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        t1.show();
        t2.show();
        t3.show();
    }
}
