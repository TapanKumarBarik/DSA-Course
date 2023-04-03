public class Solution {
    public int[][] solve(int A) {

        int n = A;

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {

            int[] ar = new int[n];
            for (int j = 0; j <= i; j++) {
                ar[j] = j + 1;
            }
            arr[i] = ar;
        }

        return arr;
    }
}
