public class Solution {
    public int[][] solve(int[] A, int[] B) {

        int n = B.length;
        int m = A.length;
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {

            int num = B[i] % m;
            int[] ar = new int[m];
            int index = 0;
            for (int j = num; j < m; j++) {
                ar[index] = A[j];
                index++;
            }
            for (int j = 0; j < num; j++) {
                ar[index] = A[j];
                index++;
            }
            arr[i] = ar;
        }

        return arr;
    }
}
