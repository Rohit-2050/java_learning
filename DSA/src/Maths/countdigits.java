package Maths;
import java.util.*;
public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter =0;
        while(num > 0){
            num = num / 10;
            counter++;
        }
        System.out.println(counter);
    }
}
