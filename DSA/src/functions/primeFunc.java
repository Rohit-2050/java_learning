package functions;
import java.util.*;
public class primeFunc {
    public static int primecheck(int n){
        if(n < 2){
            return 0;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return 0;
            }
        }
        return 1;
    }
public static void inrange(int n){
        for(int i = 2;i<=n;i++){
            if(primecheck(i)== 1){
                System.out.print(i+ " ");
            }
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inrange(n);

    }
}
