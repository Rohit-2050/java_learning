package sorting;

import java.util.Arrays;

public class insertionSort {
    public static void insert(int arr[]){
        for(int i =1;i< arr.length;i++){
            int cuur = arr[i];
            int pre = i -1;
            while (pre >= 0 && arr[pre] > cuur){
                arr[pre + 1] = arr[pre];
                pre--;
            }
            arr[pre + 1] = cuur;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,1,2};
       insert(arr);
        System.out.print(Arrays.toString(arr));
    }
}
