package basics;

import java.util.Scanner;

public class squareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("The area of square is "+ area);
    }
}
