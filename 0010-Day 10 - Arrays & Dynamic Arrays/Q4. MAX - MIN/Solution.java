public class Solution {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int n = A.length;
        return A[n - B] - A[B - 1];
    }
}
