import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter ending number : ");
        int a=0,b=1;
        int n = sc.nextInt();
        System.out.println();
        int series= 0;
        System.out.print(" fibonnaci series : ") ;

        for(int i=2;i<=n;i++)
        {
          series = a;
          System.out.println(a);
          
        }
      
    }
}
