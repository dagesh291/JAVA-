// public class numeric_pyramid {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=n-i;j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
// public class numeric_pyramid {
//         public static void main(String[] args) {
//             int n=5,number=10;
//             for(int i=1;i<=n;i++)
//             {
//                 for(int j=1;j<=i;j++)
//                 {
//                     System.out.print(number+"  ");
//                     number--;
//                 }
//                 System.out.println();
//             }
//         }
//     }
public class numeric_half_pyramid {
        public static void main(String[] args) {
            int n=5;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                   if((i+j)%2==0)
                   {
                    System.out.print(" x ");
                   }
                   else
                   {
                    System.out.print(" y ");
                   }
                }
                System.out.println();
            }
        }
    }