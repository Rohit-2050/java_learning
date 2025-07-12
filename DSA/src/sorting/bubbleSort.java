/* it works by comparing the large numbers with next element and
move to it own position by moving one position at a time */
// time complexity o(n^2)
//space complexity o(n^2)
package sorting;
import java.util.*;
public class bubbleSort {
    public static void bubble(int arr[]){
        for(int i =0;i< arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,1,2};
        bubble(arr);
        System.out.print(Arrays.toString(arr));
    }
}
