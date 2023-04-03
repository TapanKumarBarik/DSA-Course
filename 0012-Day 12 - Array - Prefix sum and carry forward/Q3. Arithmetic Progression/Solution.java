public class Solution {
    public int solve(int[] A) {

        Arrays.sort(A);

        int n = A.length;
        int diff = A[1] - A[0];

        for (int i = 1; i < n; i++) {
            if (A[i] - A[i - 1] != diff) {
                return 0;
            }
        }

        return 1;
    }
}
