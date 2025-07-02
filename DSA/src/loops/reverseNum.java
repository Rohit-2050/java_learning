package loops;
import java.util.*;
public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number;
        int rev = 0;
        while (number > 0){
            int lastdigit = number % 10;
            number = number / 10;
           rev = rev * 10+ lastdigit;

        }
        System.out.println(rev);
    }

}
