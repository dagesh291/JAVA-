import java.util.Scanner;

public class calculaor {
    public static void main(String[] args) {
        char operator;
        double number1 , number2 , result;
     Scanner sc = new Scanner(System.in);
     System.out.println(" enter the first number ");
     number1 = sc.nextDouble();
     System.out.println("enter second number ");
     number2 = sc.nextDouble();

     System.out.println(" choose any one operator : + ,-,*,/");
     operator = sc.next().charAt(0);
    
     switch(operator){
        case '+':{
            result = number1 + number2;
           System.out.println("addition of these two numbers is "+result);
            return;
        }
        case '-':{
            result = number1 - number2;
           System.out.println("difference of these two numbers is "+result);
            return;
        }
        case '*':{
            result = number1 * number2;
           System.out.println("multiplication of these two numbers is "+result);
            return;
        }
        case '/':{
            result = number1 / number2;
           System.out.println(" dividance of these two numbers is "+result);
            return;
        }
     }
    }
}
