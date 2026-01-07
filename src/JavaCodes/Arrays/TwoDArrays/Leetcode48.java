package JavaCodes.Arrays.TwoDArrays;

import java.util.Arrays;

public class Leetcode48 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(rotate(matrix)));
    }
    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];
        int row = 0, col = 0;
        for(int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
}
