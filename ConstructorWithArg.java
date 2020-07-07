package javaapplication2;

import java.util.Scanner;

class Test {
    int i,j;
    Test(int x,int y) {
        i=x;
        j=y;
        System.out.println("Constructor called");
    }
    void add(){
        System.out.println(i+j);
    }
}
public class ConstructorWithArg
{
	public static void main(String[] args) {
	           Test t1= new Test(10,20);
	           t1.add();
	           Test t2=new Test(30,40);
	           t2.add();
	}
}
