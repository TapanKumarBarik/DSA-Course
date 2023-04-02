public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {

        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (A[i][i] != 1) {
                return 0;
            }
        }
        return 1;
    }
}
