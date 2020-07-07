package javaapplication2;

import java.util.Scanner;

class Test{
    int i,j;
    void set(int x,int y){
    i=x;
    j=y;
    }
    void add(){
        System.out.println(i+j);
    }
}
public class ClassAndObjectAllocateMemory
{
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test();
		t1.set(10,20);
		t2.set(30,40);
		t1.add();
		t2.add();
	}
}