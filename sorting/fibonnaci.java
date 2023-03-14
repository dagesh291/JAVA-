package sorting;

import java.util.Scanner;

public class fibonnaci {
    public static void name(int a , int b , int n) {
     
     if(n==1)
     {
      return;
     } 
     int  c = a+b;
       System.out.println(c);
        name(b, c, n-1);
       
        
    }
  public static void main(String[] args) {
    System.out.println();
    int a = 0, b = 1;
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
   System.out.println(a);
   System.out.println(b);
  
   name(a, b, n-2);
  }
}
