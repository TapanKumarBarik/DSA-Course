public class Solution {
    public int[][] solve(int[][] A, int[][] B) {

        int n = A.length;
        int m = B[0].length;

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                for (int k = 0; k < A[0].length; k++) {

                    arr[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return arr;
    }
}
