package patterns;

public class floydTri {
    public static void floyd(int n){
        int count = 1;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyd(5);
    }
}
