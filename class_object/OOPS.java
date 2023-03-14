package class_object;

class Pen{
    String color , type ;
   
    public void print() {
        System.out.println(" writing something ");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
    public void type(){
        System.out.println(this.type);
    }
}

public class OOPS {
    public static void main(String[] args) {
       
    Pen pen1 = new Pen();
    Pen pen2 = new Pen();
    pen1.color = " red";
    pen1.type = " gel";
    pen1.print();
    pen1.printcolor();
    pen1.type(); pen2.color = " blue";
    pen2.type = " point";
    pen2.print();
    pen2.printcolor();
    pen2.type();
    }
    
}
