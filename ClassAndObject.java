package javaapplication2;

import java.util.Scanner;

class Dog{
    String breed, color, temperament;
    void setdata(String b, String c, String t){
    breed=b;
    color=c;
    temperament=t;
    }
    void showdata() {
        System.out.println(breed);
        System.out.println(color);
        System.out.println(temperament);
    }
}
public class ClassAndObject
{
	public static void main(String[] args) {
		Dog ob1=new Dog();
		ob1.setdata("German Shephard","brown","aggressive");
		
		Dog ob2=new Dog();
		ob2.setdata("Labrodor","white","not aggressive");
		
		ob1.showdata();
		ob2.showdata();
	}
}
