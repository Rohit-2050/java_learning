package functions;
import java.util.*;
public class palindromNum {
    public static int check(int n ){
        int original = n;
        int reverse = 0;
        while (n > 0) {

            int lastdigit = n %10;
             reverse = reverse  * 10 + lastdigit;
            n= n /10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
if(check(n)== n){
    System.out.println("Palindrom");
}
else{
    System.out.println("not");
}
    }
}
