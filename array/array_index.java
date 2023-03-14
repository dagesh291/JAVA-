package array;

import java.util.Scanner;

public class array_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the size of array :");
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i=0;i<size;i++)
        {
           num[i] = sc.nextInt();
        }
        // System.out.println("index 4th value of num array is :"+num[4]);
        // num[4] = 100;
        // System.out.println("index 4th value of num array is :"+num[4]);
        System.out.print(" all elements of an array are : ");
        for(int i=0;i<size;i++)
        {
            System.out.println(num[i]);
        }
        System.out.println("all even numbers of an array are ");
        for(int i=0;i<size;i++)
        {
          
            if(num[i]%2==0)
            {
                System.out.println(num[i]);
            }
        }
        System.out.println(" sum of all even numbers of array are : ");
        int sum =0;
        for(int i=0;i<size;i++)
        {
            if(num[i]%2==0)
           {
               sum = sum + num[i];
           }
        }
        System.out.println(sum);
    }
}
