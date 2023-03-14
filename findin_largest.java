import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthPanelUI;

public class findin_largest {
    public static void main(String[] args) {
        int n1 = 20 , n2=30 , n3=40;
        if(n1>n2 && n1>n3)
        System.out.println(n1+"  is largest amoung three ");
        else if(n2>n1 && n2>n3)
        System.out.println(n2+"  is lagest ");
        else 
        System.out.println(n3+"  is largest");

    }
}
