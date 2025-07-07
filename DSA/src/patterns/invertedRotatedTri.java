package patterns;

public class invertedRotatedTri {
    public static void triangle(int totrow,int totcol){
        for(int i =1;i<=totrow;i++){
            for(int j =1;j<=totcol;j++){
                if(i + j >= 5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        triangle(4,4);
    }
}
