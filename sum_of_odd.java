
    
import java.util.Scanner;

public class sum_of_odd{

    public static void sumOdd(int x) {
        int sum =0;
        for(int i=0;i<=x;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            else
            {
               sum = sum+i;
            }
        }
        System.out.println("sum of all odd numbers between given limits is "+sum);
    }
    public static void main(String[] args) {
        System.out.println(" print the sum of odd numbers between given interval ");
        Scanner odd = new Scanner(System.in);
        int end = odd.nextInt();
       sumOdd(end);
    }
}


