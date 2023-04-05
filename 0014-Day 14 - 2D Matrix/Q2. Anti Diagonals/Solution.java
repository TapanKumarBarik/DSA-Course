public class Solution {
    public int[][] diagonal(int[][] A) {

        int n = A.length;

        int[][] arr = new int[2 * n - 1][n];

        for (int i = 0; i < arr.length; i++) {

            int offSet = 0;

            if (i >= n) {
                offSet = i - n + 1;
            }

            int k = 0;
            for (int j = offSet; j <= i - offSet; j++) {
                arr[i][k] = A[j][i - j];
                k++;
            }
        }

        return arr;
    }
}
