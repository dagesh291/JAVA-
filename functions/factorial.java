package functions;

import java.util.Scanner;


public  class factorial {
    private static void factorial(int x) {
        int fact = 1;
        for(int i=1;i<=x;i++)
        {
            fact = fact*i;
        }
        System.out.println(" factorial of given number is :"+fact);
    }
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("enter the value that you wanted to get factorial : ");
        int n = val.nextInt();
        factorial(n);
    }
}
