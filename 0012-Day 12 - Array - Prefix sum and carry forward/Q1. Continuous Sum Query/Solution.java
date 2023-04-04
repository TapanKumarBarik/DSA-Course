public class Solution {
    public int[] solve(int A, int[][] B) {

        int n = A;
        int[] arr = new int[n];

        for (int i = 0; i < B.length; i++) {

            for (int j = B[i][0] - 1; j < B[i][1]; j++) {
                arr[j] += B[i][2];
            }
        }

        return arr;
    }
}
