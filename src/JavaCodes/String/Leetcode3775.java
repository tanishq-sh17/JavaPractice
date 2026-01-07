package JavaCodes.String;

import java.util.Set;

public class Leetcode3775 {
    public static void main(String[] args) {
        String s = "cat and mice";
        reverseWords(s);
    }
    public static void reverseWords(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        StringBuilder str = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        int count = -1;
        int tempCount = 0;
        int idx = 0;


        while(idx < s.length()) {

            char ch = s.charAt(idx);

            if (ch == ' ') {
                if (str.length() > 0) {
                    if (tempCount == count) {
                        ans.append(reverse(str.toString(), 0, str.length() - 1));
                    } else {
                        ans.append(str);
                    }

                    count = tempCount;
                    tempCount = 0;
                    str.setLength(0);
                }
                ans.append(' ');
            }
            else{
                str.append(ch);
                if(vowels.contains(ch)) tempCount++;
            }
            idx++;
        }
        if (str.length() > 0) {
            if (tempCount == count) {
                ans.append(reverse(str.toString(), 0, str.length() - 1));
            } else {
                ans.append(str);
            }
        }
        System.out.println(ans);
    }
    public static String reverse(String str, int start, int end) {
        char[] arr = str.toCharArray();

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return new String(arr);
    }
}
