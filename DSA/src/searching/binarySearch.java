package searching;
import java.util.*;
public class binarySearch {
    public static int binary(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) /2;
            if(arr[mid]== key){
                return mid;
            }
            else if(arr[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int results = binary(arr,10);
        System.out.println(results);
    }
}
