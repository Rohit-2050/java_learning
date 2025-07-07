package patterns;

public class binaryTriangle {
    public static void tri(int n ){
        int count = 1;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(count);
                if(count == 1){
                    count = 0;
                }
                else{
                    count = 1;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
tri(5);
    }
}
