package patterns;

public class solidRhombus {
    public static void rhom(int n){
        for(int i  =1;i<=n;i++){
            //spaces
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rhom(5);
    }
}
