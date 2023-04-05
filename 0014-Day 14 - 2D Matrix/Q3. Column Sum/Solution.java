public class Solution {
    public int[] solve(int[][] A) {

        int n = A[0].length;
        int m = A.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            int sum = 0;
            for (int j = 0; j < m; j++) {

                sum += A[j][i];
            }
            arr[i] = sum;
        }

        return arr;
    }
}
