package patterns;

public class butterfly {
    public static void firsthalf(int n ){
        for(int i =1;i<=n;i++){
            //stars
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j =1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void secondhalf(int n ){
        for(int i =n;i>=1;i--){
            //stars
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j =1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        firsthalf(4);
        secondhalf(4);
    }
}
