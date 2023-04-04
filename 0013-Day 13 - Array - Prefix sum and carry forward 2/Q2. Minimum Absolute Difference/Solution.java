import java.util.Arrays;

public class Solution {
    public int solve(int[] A) {

        int n = A.length;

        Arrays.sort(A);

        int diff = Math.abs(A[0] - A[n - 1]);

        for (int i = 0; i < n - 1; i++) {
            diff = Math.min(Math.abs(A[i] - A[i + 1]), diff);
        }

        return diff;
    }

}
