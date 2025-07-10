package searching;
import java.util.*;
public class reversearray {
    public static void reverse(int arr[]){
        int first = 0;
        int last = arr.length-1;
        while(first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}
