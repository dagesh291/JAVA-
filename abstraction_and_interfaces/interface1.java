package abstraction_and_interfaces;

interface Animal{
    int eye = 2;
    void walk();
   void eat();
}

c lass Horse implements Animal{
    public void walk(){
        System.out.println("walk on four legs ");
    }
}

public class interface1{
    Horse horse = new Horse();
    horse.walk();
}
//we cannot change interface by derived class 