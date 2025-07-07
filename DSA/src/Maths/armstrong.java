
package Maths;

public class armstrong {
    public static void main(String[] args) {
        int n = 103;
        int orig = n;
        int sum = 0;
        while(n > 0){
            int lastdgit = n % 10;
            int cube = lastdgit * lastdgit * lastdgit;
            sum+=cube;
            n = n / 10;
        }
        if(sum == orig){
            System.out.println("armstrong");
        }
        else{
            System.out.println("no");
        }
    }
}
