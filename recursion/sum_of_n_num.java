package recursion;

public class sum_of_n_num {
    public static void print(int i , int n , int sum) {
        if(i==n)
        {
           System.out.println(sum);
           return;
        }
        sum  = sum+i;
        print(i+1, n, sum);
      
    }
    public static void main(String[] args) {
        int i = 1 , n = 10 , sum =0 ;
        print(i, n, sum);
    }
}
