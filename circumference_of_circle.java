import java.util.Scanner;

public class circumference_of_circle {

    public static void circumference(int x) {
           double pi = 3.14;
           double circumference = 2*x*pi;
           System.out.println(" circumference of circle is :"+circumference);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the radius of circle :");
        int radius = sc.nextInt();
        circumference(radius);
}
}