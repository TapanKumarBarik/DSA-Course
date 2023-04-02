public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = A[i + 1] - A[i];
        }
        return arr;
    }
}
