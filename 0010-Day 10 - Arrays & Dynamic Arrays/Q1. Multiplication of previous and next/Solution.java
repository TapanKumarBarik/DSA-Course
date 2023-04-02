public class Solution {
    public int[] solve(int[] A) {

        int n = A.length;
        if (n == 1) {
            return A;
        }
        int[] arr = new int[n];

        for (int i = 1; i < n - 1; i++) {
            arr[i] = A[i - 1] * A[i + 1];
        }
        arr[0] = A[0] * A[1];
        arr[n - 1] = A[n - 1] * A[n - 2];

        return arr;
    }
}
