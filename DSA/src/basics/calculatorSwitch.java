package basics;
import java.util.*;
public class calculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        int result = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch(ch){
            case("+"):
                result = a +b;
                break;
            case("-"):
                result = a -b;
                break;
            case("*"):
                result = a  *b;
                break;
            case("/"):
                result = a /b;
                break;
            default:
                System.out.println("Invalid");

        }
        System.out.println(result);
    }
}
