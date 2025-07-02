package basics;

import java.util.Scanner;

public class floatCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float rubber = sc.nextFloat();

        float total = pen + pencil + rubber;

        float gst = (float) (total * 0.18);

        total = total + gst;

        System.out.println(total);
    }
}
