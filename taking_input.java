import java.util.Scanner;

public class taking_input{
      public static void printMyName(String name) {
        System.out.println(name);
      }
    public static void main(String[] args) {
        System.out.print(" enter word or name : ");
       Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
     

       printMyName(name);
    }
}
