package sorting;

public class factorial {
    public static int factnum(int n) {
        if(n==1 || n==0)
        {
            return 1;
        }
        int previous = factnum(n-1);
        int fact = n*previous;
         return fact;
        
    }
    public static void main(String[] args) {
        int a = 5 ;
       int ans = factnum(a);
       System.out.println(ans);
  
    }
}
