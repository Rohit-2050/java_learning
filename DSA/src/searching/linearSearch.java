package searching;
import java.util.*;

public class linearSearch {
    public static int linear(int nums[],int key){
        for(int i =0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8};
        int key = 5;
        int result = linear(nums,key);
        System.out.println(result);
    }
}
