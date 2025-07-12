package sorting;
// selects the smallest from the unsorted and pushes to begining
// time complexity o(n^2)
//space complexity o(n^2)
import java.util.Arrays;

public class selectionsort {
    public static void selection(int arr[]){
        for(int i =0;i< arr.length;i++){
            int minpos = i;
            for(int j =i+1;j< arr.length;j++){
                if(arr[minpos]> arr[j]){
                    minpos = j;
                }

            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,1,2};
        selection(arr);
        System.out.print(Arrays.toString(arr));
    }
}
