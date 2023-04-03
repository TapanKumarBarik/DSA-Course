public class Solution {
    public int solve(int[] A) {

        int n = A.length;
        Arrays.sort(A);

        if (A[n - 1] == 0) {
            return 1;
        }

        for (int i = 0; i < n - 1; i++) {

            if (A[i] > 0) {
                if (A[i] != A[i + 1]) {
                    if (A[i] == n - i - 1) {
                        return 1;
                    }
                }
            }
        }

        return -1;
    }
}
