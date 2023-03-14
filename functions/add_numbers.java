// package functions_methods;

// import java.util.Scanner;

// public class add_numbers {

//     public static void addition() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" value of a is :");
//         int a = sc.nextInt();
//         System.out.println(" value of b is :");
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println(" sum of " + a + "+" + b + " is : " + sum);
//     }

//     public static void main(String[] args) {

//         addition();

//     }
// }

package functions;

import java.util.Scanner;

public class add_numbers {

public static void addition(int x, int y) {

int sum = x + y;
System.out.println(" sum of " + x + "+" + y + " is : " + sum);

}

public static void main(String[] args) {
Scanner pr = new Scanner(System.in);
System.out.print("enter the value of x and y : ");
int x = pr.nextInt();
int y = pr.nextInt();
addition(x , y);

}
}
