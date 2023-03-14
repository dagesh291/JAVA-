package class_object;

class Student{
    int age ;
    String name ;
    
    Student(){
     System.out.println(" constructor called ");
    }
    
}
public class default_constructor {
    public static void main(String[] args) {
        
    Student s1 = new Student();
    s1.age = 21;
    s1.name = " dagesh dewangan ";
    }
}
