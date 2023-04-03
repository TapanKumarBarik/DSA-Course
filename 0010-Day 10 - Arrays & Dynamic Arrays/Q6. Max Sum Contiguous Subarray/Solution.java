public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {

        int sum = Integer.MIN_VALUE;

        int n = A.length;
        int currSum = 0;

        for (int i = 0; i < n; i++) {

            currSum += A[i];
            sum = Math.max(sum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }

        return sum;
    }
}
