public class Solution {
    public int solve(String A) {
        int mod = 1000000007;
        int n = A.length();

        int[] arr = new int[n];
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (A.charAt(i) == 'G') {

                count++;
                arr[i] = count;
            } else {
                arr[i] = count;
            }
        }
        // System.out.println(Arrays.toString(arr));
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == 'A') {

                ans += arr[i];
                ans %= mod;
            }
        }

        return (ans + mod) % mod;
    }
}
