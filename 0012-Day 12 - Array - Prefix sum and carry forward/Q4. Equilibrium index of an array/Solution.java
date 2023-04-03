public class Solution {
    public int solve(int[] A) {

        int n = A.length;
        int[] left = new int[n];
        int[] right = new int[n];

        // left
        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            leftSum += A[i];
            left[i] = leftSum;
        }

        // right
        int rightSum = 0;

        for (int i = n - 1; i >= 0; i--) {
            rightSum += A[i];
            right[i] = rightSum;
        }

        for (int i = 0; i < n; i++) {
            if (left[i] == right[i]) {
                return i;
            }
        }
        return -1;
    }
}
