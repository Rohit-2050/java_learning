package patterns;
import java.util.*;
public class hollowRect {
    public static void rect(int totrows, int totcol ){
        for(int i =1;i<=totrows;i++){
            for(int j = 1; j<=totcol;j++ ){
                if(i==1||i==totrows||j==1||j==totcol){
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
rect(10,7);
    }
}
