package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// import java.util.*;
public class integer {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        // // insert elements to the list 
        // list.add(0);
        // list.add(2);
        // list.add(5);
        // list.add(7);
        // list.add(9);
        System.out.println("enter the elements you want into arrylist ");
     Scanner sc = new Scanner(System.in);
        int n=10;
        for(int i =0;i<=n;i++)
        {
             i = sc.nextInt();
             list.add(i);
        }

        //to get elements
        list.get(3);
        System.out.println(list);
        System.out.println(" element of index 3rd is "+list.get(3));

        // adding elements in variable position 
        list.add(3,10);
        System.out.println(" new element is "+list.get(3));

        // change element 
        list.set(3,80);
        System.out.println(" changed element is "+list.get(3));
System.out.println(list);

        // delete element
        list.remove(4);
        System.out.println(list);

        // size of arraylist
        System.out.println("size of arraylist is "+list.size());

        // // using loop
        // for(int i=0;i<=list.size();i++)
        // {
        //     System.out.println(list.get(i));
        // }

        //sorting 
        Collections.sort(list);
        System.out.println(list);
    }
}
