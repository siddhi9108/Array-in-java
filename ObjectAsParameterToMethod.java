package javaapplication2;

import java.util.Scanner;

import java.util.Scanner;
import static java.lang.Math.PI;

class Test {

    int i, j;

    Test() {
        i = 10;
        j = 20;
    }

    Test(int x, int y) {
        i = x;
        j = y;
    }

    Test add(Test ob) {
        Test temp = new Test();
        temp.i = this.i + ob.i;
        temp.j = this.j + ob.j;
        return temp;
    }

    void show() {
        System.out.println(i);
        System.out.println(j);
    }
}

public class ObjectAsParameterToMethod {

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(30, 40);
        Test t3;
        t3 = t1.add(t2);
        t3.show();
    }
}
