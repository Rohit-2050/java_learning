package functions;
import java.util.*;
public class factorialFunc {
    public static int factorial(int num){
        int fact = 1;
        for(int i =1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int num =  4;
int result = factorial(num);
        System.out.println(result);
    }
}
