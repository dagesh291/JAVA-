package arraylist;
import java.util.*;
// import java.util.ArrayList;

public class String1{
    public static void main(String args[]){
        ArrayList<String> list= new ArrayList<String>();
        //  list.add("dagesh");
        //  list.add("kumar");
        //  list.add("dewangan");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=5;i++)
        {
            i = sc.nextInt();
            list.add("i");
        }
       System.out.println(list);
    }
}
