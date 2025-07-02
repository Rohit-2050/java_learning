package basics;
import java.util.*;
public class typeconversions {
    public static void main(String[] args) {
        //type conversion implicit done by java itself
        int a = 10;
        long b= a;
        System.out.println(a);
        // it is converted  as long but vice versa wont work

        //type casting, explicit done manually
        float c = 3.88f;
        int d = (int) c;
        System.out.println(d);

    }
}
