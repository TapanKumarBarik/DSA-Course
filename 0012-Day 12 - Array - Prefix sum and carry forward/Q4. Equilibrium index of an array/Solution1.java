public class Solution1 {
    public int solve(int[] A) {

        int n = A.length;

        int sum = 0;

        for (int i = 1; i < n; i++) {
            sum += A[i];
        }

        if (sum == 0) {
            return 0;
        }

        int sumTillNow = 0;
        for (int i = 1; i < n; i++) {
            sumTillNow += A[i - 1];
            sum -= A[i];

            if (sumTillNow == sum) {
                return i;
            }
        }

        return -1;
    }
}
