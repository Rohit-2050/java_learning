package functions;
import java.util.*;
public class sumFunc {
    public static int calculatesum(int a , int b){
        int sum = a +b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = calculatesum(2,3);
        System.out.println(result);
    }
}
