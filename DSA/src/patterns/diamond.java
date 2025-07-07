package patterns;

public class diamond {
    public static void firstdia(int n){
        for(int i =1;i<=n;i++){
            //spaces
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j =1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            //spaces
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void seconddia(int n){
        for(int i =n;i>=1;i--){
            //spaces
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j =1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            //spaces
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
firstdia(4);
seconddia(4);
    }
}
