package JavaCodes.String;

import java.util.*;

public class Leetcode3 {
    public static void main(String[] args) {
        String s = "badack";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int count = 0;
        int maxCount = 0;
        int left = 0, right = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
                count++;
                maxCount = Math.max(maxCount, count);
                right++;
            }
            else{
               set.remove(s.charAt(left));
               left++;
               count--;
            }
        }
        return maxCount;
    }
}
