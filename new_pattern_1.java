// public class new_pattern_1 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }

//             for (int j = n - 1; j >= i; j--) {
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
// }
public class new_pattern_1 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }
