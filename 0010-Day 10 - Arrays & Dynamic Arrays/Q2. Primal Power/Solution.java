public class Solution {
    public int solve(int[] A) {
        int num = 0;
        int n = A.length;

        for (int i = 0; i < n; i++) {
            if (A[i] > 1) {
                if (isPrime(A[i])) {
                    num++;
                }
            }
        }
        return num;
    }

    private boolean isPrime(int num) {

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
