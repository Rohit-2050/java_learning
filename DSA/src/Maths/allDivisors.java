package Maths;

public class allDivisors {
    public static void main(String[] args) {
        int num = 8;
        for(int i =1;i<=num;i++){
            if(num % i ==0){
                System.out.print(i+" ");
            }
        }
    }
}
