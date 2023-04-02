public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, int B) {

        int n = A.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = A[i] + B;
        }

        return arr;
    }
}
