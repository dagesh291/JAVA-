package recursion;

public class tower_of_henoi {
    public static void henoi(int n,String source , String helper ,String destination ) {
        if(n==1)
        {
            System.out.println(" disc transfer "+n+" from "+source+" to "+destination);
            return;
        }
        henoi(n-1, source, destination, helper);
        System.out.println(" disc transfer "+n+" from "+source+" to "+destination);
        henoi(n-1, helper,source,destination );
    }
    public static void main(String[] args) {
       int n= 2;
       henoi(n, "s", "h" ,"d");
    }
}