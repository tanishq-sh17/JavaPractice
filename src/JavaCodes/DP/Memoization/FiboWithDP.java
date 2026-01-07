package JavaCodes.DP.Memoization;

import java.util.Arrays;
import java.util.Scanner;

public class FiboWithDP {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println(fibo(n));
    }
//    public static int fibo(int n){
//        int[] dp = new int[n+1];
//        Arrays.fill(dp, -1);
//        return solve(n, dp);
//    }
//    public static int solve(int n, int[] dp){
//        if(n == 0 || n == 1){
//            return n;
//        }
//        if(dp[n] != -1) return dp[n];
//
//        return dp[n] = solve(n-1, dp) + solve(n-2, dp);
//    }

    public static int fibo(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[dp.length-1];
    }
}
