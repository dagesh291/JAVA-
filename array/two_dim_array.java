package array;

import java.util.Scanner;

public class two_dim_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the number of rows :");
        int row = sc.nextInt();
        System.out.print(" enter the number of columns :");
        int columns = sc.nextInt();
        int num[][] = new int[row][columns];
        for(int i=1;i<row;i++)
        {
            for(int j=1;j<columns;j++)
            {
                num[i][j] = sc.nextInt();
            }
        }  
         for(int i=1;i<row;i++)
        {
            for(int j=1;j<columns;j++)
            {
                System.out.print(num[i][j]+" ");
            }System.out.println();
        }
    }
}


