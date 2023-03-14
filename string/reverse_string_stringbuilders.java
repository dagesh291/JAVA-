package string;

public class reverse_string_stringbuilders {
    public static void main(String[] args) {
        StringBuilder ps = new StringBuilder("hello");
        for(int i=0;i<ps.length()/2;i++)
        {
            int front = i;
            int back = ps.length()-1-i;
  
            char frontchar = ps.charAt(front);
            char backchar = ps.charAt(back);

            ps.setCharAt(front,backchar);
            ps.setCharAt(back, frontchar);
        }
        System.out.println(ps);
    }
}
