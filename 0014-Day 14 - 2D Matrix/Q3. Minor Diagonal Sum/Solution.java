public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int j = A[0].length - 1;
        int i = 0;
        int sum = 0;

        while (j >= 0) {
            sum += A[i][j];
            j--;
            i++;
        }

        return sum;
    }
}
