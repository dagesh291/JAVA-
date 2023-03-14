package array;

import java.util.Scanner;

public class find_index {
    public static void main(String[] args) {
        Scanner np = new Scanner(System.in);
        System.out.println(" enter the value of rows and columns :");
        int row = np.nextInt();
        int col = np.nextInt();
        System.out.print("enthe elements of an array :");
        
        int num[][] = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
              num[i][j] = np.nextInt();
            }
        }
        System.out.println();

        System.out.println(" elements of an array are ");
        for(int i=0;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
        System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        int x = 10;
        for(int i=1;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
                if(num[i][j]==x)
              System.out.println(" index number of x is "+i+"&"+j);
            }
        }

    }
}
