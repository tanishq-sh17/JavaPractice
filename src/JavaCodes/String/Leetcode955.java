package JavaCodes.String;

public class Leetcode955 {
    public static void main(String[] args) {
        String[] strs = {"xc","yb","za"};
        System.out.println(minDeletionSize(strs));
    }
    public static int minDeletionSize(String[] strs) {
        int m = strs.length;       // rows
        int n = strs[0].length();  // cols
        int minLen = n;
        boolean[] good = new boolean[n];
        for(int i = 0; i < n; i++){

            for(int j = 1; j < m; j++){
                if(strs[j-1].charAt(i) > strs[j].charAt(i)){
                    good[i] = true;
                    break;
                }


            }

        }
        int count = 0;
        for(int k = 0; k < good.length; k++){
            if(good[k] == true){
                count++;
            }
        }
        return count;
    }
}
