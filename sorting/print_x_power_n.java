package sorting;

import java.util.Scanner;

public class print_x_power_n {
    public static int calcnum(int x , int n) {
        if(n==1)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
        }
        int num1 = calcnum(x, n-1);
        int num2 = x*num1;
        return num2;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n ab x : ");
        int x = sc.nextInt();
        int n = sc.nextInt();
    int ans = calcnum(x, n);
    System.out.println(" the ans is : "+ans);
    }
}
