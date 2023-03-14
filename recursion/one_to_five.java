package recursion ;
public class one_to_five {
    public static void print(int o) {
        if(o==6)
        {
            return;
        }
       System.out.println(o);
       print(o+1);
    }
    public static void main(String[] args) {
        int n = 1  ;
        print(n);
    }
}
