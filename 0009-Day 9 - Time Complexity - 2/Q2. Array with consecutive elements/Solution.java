public class Solution {
    public int solve(int[] A) {

        Arrays.sort(A);
        int n = A.length;

        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 != A[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
}
