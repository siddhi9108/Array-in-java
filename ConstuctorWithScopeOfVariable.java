package javaapplication2;

import java.util.Scanner;

class Test{
    int i;
    Test(int i){
        i=i;
    }
    void add(){
        System.out.println(i+i);
    }
}
public class ConstuctorWithScopeOfVariable
{
	public static void main(String[] args) {
		Test t1= new Test(10);
		t1.add();
	}
}