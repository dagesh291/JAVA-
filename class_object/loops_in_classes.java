package class_object;

import java.util.Scanner;

class Student{
    String  gender;
    int id ;
String name[] = new String[10];
    public void printnames(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the numbers of student ");
       int n = sc.nextInt();
       System.out.println(" enter names ");
        for(int i=0;i<=n;i++){
            name[i] = sc.nextLine();
        }System.out.println(name);
        for(int i=0;i<=n;i++){
            System.out.println(name[i]);
        }
    }
}
public class loops_in_classes {
    public static void main(String[]args){
        Student s1 = new Student();
        s1.printnames();
    }
}
