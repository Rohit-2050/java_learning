package functions;
import java.util.*;
public class swapFunc {
    public static void swapping(int a ,int b){
        int temp = a;
        a = b;
        b= temp;
        System.out.println("a is"+ a);
        System.out.println("b is"+ b);
    }
    public static void main(String[] args) {
        int a = 45;
        int b = 55;
        swapping(a,b);
    }
}
