public class Solution {
    public long subarraySum(int[] A) {
        int n = A.length;

        long ans = 0;

        for (int i = 0; i < n; i++) {
            int num = A[i];
            ans += (long) num * (i + 1) * (n - i);
        }

        return ans;
    }
}
