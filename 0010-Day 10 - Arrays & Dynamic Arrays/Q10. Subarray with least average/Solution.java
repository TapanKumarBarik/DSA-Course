public class Solution {
    public int solve(int[] A, int B) {

        int ans = 0;
        int n = A.length;
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        int currSum = sum;
        int index = 0;

        for (int i = B; i < n; i++) {

            // remove
            currSum -= A[index];
            index++;

            // add
            currSum += A[i];

            // check
            if (currSum < sum) {
                // update ans
                ans = index;
                sum = currSum;
            }

        }

        return ans;
    }
}
