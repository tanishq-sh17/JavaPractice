package JavaCodes.Arrays;

public class Leetcode2529 {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(nums));
    }
    public static int maximumCount(int[] nums) {
        int start = 0, end = nums.length-1;
        int pos = 0, neg = 0;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] < 0){
                end = mid;
                neg += mid;
            }
            else if(nums[mid] > 0){
                start = mid;
                pos += (end - mid);
            }
            else{
                start = mid + 1;
            }
        }
        return Math.max(pos, neg);
    }
}
