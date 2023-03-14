package array;

import java.util.Scanner;

public class ten_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the size of your array : ");
        
        int size = sc.nextInt();
        int marks[] = new int[size];
        for(int i=1;i<size;i++)
        {
            marks[i] = sc.nextInt();
        }
        for(int i=1;i<size;i++)
        {
            System.out.print(marks[i]+" ");
        }
    }
}
