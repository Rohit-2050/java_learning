package basics;
import java.util.*;
public class arthimeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //binary
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //unary
        //pre-increment
        System.out.println(++a);
        System.out.println(--b);
    }
}
