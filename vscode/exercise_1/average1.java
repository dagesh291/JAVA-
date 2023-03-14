
import java.util.Scanner;

public class  average1{ 
    
    public static void average(int x , int y, int z) {
            int sum = x+y+z;;
            System.out.println(" sum of "+x+","+y+","+z+" is = "+sum );
          int average = sum/3;
            System.out.println(" average = "+average);
          
        }
    public static void main(String[] args) {

        System.out.println("enter three number to be added : ");
        Scanner num = new Scanner(System.in);
      
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
     average(a, b, c);
  
    }
    
}
