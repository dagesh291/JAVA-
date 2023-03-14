package abstraction_and_interfaces;

abstract class Animal{
     Animal(){
        System.out.println(" animal is a abstract class thats why we can not creat its object ");
    }
    public void walk(){

    }
    public void eat(){
        System.out.println(" Animal eats food ");
    }
   
}
class Horse extends Animal{
     Horse(){
        System.out.println(" constructor of horse class ");
    }
    public void walk(){
        System.out.println(" walks on 4 legs ");
    }
   
}
class Chicken extends Animal{
    Chicken(){
        System.out.println(" constructor of chicken class ");
    }
    public void walk(){
        System.out.println(" walks on 2 legs ");
    }
}
public class abstraction {
    public static void main(String[]args){
        Horse horse = new Horse();
        horse.walk();
        Chicken chicken = new Chicken();
        chicken.walk();
        
        horse.eat(); // function of abstract class 
    }
}
// we does not make object of abstract class directly but 

// we can use fuctions of abstract class by derived class object 

// also we can use constructer of abstract class by derived class object 