public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[] A) {

        int n = A.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (A[i] == A[j]) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
