package loops;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 2){
            System.out.println("it is prime");

        }
        else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println("its not prime");
                } else {
                    System.out.println("it is prime");
                    break;
                }
            }
        }
    }
}
