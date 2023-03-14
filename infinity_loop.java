public class infinity_loop {
    public static void loop() {
        int n =5;int i = 1;
        do{
            
            i= i*n;
            i++;
            System.out.print(i);
        }while(1<=n);
    }
    public static void main(String[] args) {
        loop();
    }
}
