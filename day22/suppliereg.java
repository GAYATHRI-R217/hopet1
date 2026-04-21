package day22;
import java.lang.Math;
public class suppliereg {
    public static void main(String[] args){
        Supplier<Integer>s=()->(int)(Math.random()*100);
        System.out.println(s.get())
    }
    
}
