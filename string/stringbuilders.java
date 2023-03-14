package string;

import java.util.Scanner;

public class stringbuilders {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
    //    String put = sc.nextLine();
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);

        StringBuilder n1 = new StringBuilder();
        System.out.println(n1);
       
        // to set any character in index of other element 
        System.out.println(" after costomization the string is : ");
        sb.setCharAt(0, 'l');
        System.out.println(sb);

        // to get element of given index 
        System.out.println("element present in second index is : "+sb.charAt(2));

        // to add new elements 
        System.out.println(" adding first element in existing element ");
        sb.insert(2, 'm');
        System.out.print(" "+sb);

        // to append elements , insert elements in last 
        System.out.println(" adding last element in string :");
        sb.append('k');
        System.out.println(""+sb);

        // to delete elements 
        sb.delete(0, 3);
        System.out.println("after delete elements from string "+sb);

        // length
        System.out.println(" length of string is : "+sb.length());
        
    }
}
