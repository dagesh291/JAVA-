package inheritence;

import java.util.Scanner;

class car{
    String company , color;
    int price;
}
class bike extends  car{

    public void printinfo(){
        Scanner s2 = new Scanner(System.in);
        System.out.println(" enter the name of company , color and price ");
        company = s2.next();
        color = s2.next();
        price = s2.nextInt();
        System.out.println("name of car company is "+company);
        System.out.println("color of car is "+color+" and price of car is  "+price);
    }
}
public class single_inheritence {
    public static void main(String[]args){
       bike c1 = new bike();
        Scanner s1 = new Scanner(System.in);
        System.out.println(" enter the program name ");
       String heading = s1.next();
     c1.printinfo();
      
    }
}
