package searching;

public class largest {
    public static int large(int nums[]){
        int largestt = Integer.MIN_VALUE;
        for(int i =0;i< nums.length;i++){
            if(nums[i]>largestt){
                largestt = nums[i];
            }
        }
        return largestt;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8};
        int result = large(nums);
        System.out.println(result);
    }
}
