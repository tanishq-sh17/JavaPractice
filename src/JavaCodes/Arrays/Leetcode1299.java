package JavaCodes.Arrays;

import java.util.Arrays;

public class Leetcode1299 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 10};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        if(n == 1){
            return new int[]{-1};
        }
        int idx = n-1;
        int[] ans = new int[n];
        ans[idx--] = -1;
        for(int i = n-1; i >= 1; i--){
            int currMax = arr[i];
            ans[idx--] = Math.max(currMax, ans[i]);
        }
        return ans;
    }

}
