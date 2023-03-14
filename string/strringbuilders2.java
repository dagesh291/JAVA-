package string;

public class strringbuilders2 {
    public static void main(String[] args) {
        StringBuilder n1 = new StringBuilder();
        // n1.append("dagesh");
        // System.out.println("string = "+n1.toString());
        // n1.append(" dewangan ");
        // System.out.println(" string = "+n1.toString());
        
   
        n1.insert(0," dagesh");
        System.out.println(n1);
        n1.insert(6, " dewangan");
        System.out.println(n1);

    }
}
