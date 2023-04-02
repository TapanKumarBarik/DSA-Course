public class Solution {
    public int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int n = A.length;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
        return max + min;
    }
}
