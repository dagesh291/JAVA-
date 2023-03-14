package recursion;

public class factorial {
    public static void fact(int i , int n , int cal) {
        if(i==n+1)
        {
            System.out.println(cal);
            return;
        }
        cal = cal*i;
        fact(i+1, n, cal);
    }
     public static void main(String[] args) {
        int i =1 , n= 5 ,cal = 1;
        fact(i, n, cal);
        }
}
