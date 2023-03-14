package sorting;

public class sum_of_n_natural_numbers {
    public static void naturalSum( int i,int sum ,int n) {
       
        if(i==n)
        {
           sum = sum+i;
           System.out.println(sum);
           return;
        } 
        sum = sum+i;
        naturalSum(i+1, sum, n);
    }
    public static void main(String[] args) {
        naturalSum(1, 0, 5);
    }
}
