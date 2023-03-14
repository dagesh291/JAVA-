package class_object;

import java.util.Scanner;

class Student{
    String name;
    int age ;
   
   public void printinfo(int age ){
        System.out.print(age);
    }
    public void printinfo(int age , String name){
        System.out.println(" age = "+age+" name ="+name);
    }
    public void printinfo(){
       Scanner sc = new Scanner(System.in);
       name = sc.next();
       System.out.println("name is = "+name);
    }
}
public class polimorphism{
   public static void main(String[]args){
    Student s1 = new Student();
    s1.age = 21;
    s1.printinfo(s1.age);
    s1.printinfo(22, "likki");
    s1.printinfo();
    }
}
