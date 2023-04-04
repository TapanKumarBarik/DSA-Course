public class Solution {
    public int solve(int[] A) {

        int n = A.length;

        int[] odd = new int[n];
        int[] even = new int[n];

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {// even

                evenSum += A[i];
                even[i] = evenSum;
                odd[i] = oddSum;
            } else {
                oddSum += A[i];
                odd[i] = oddSum;
                even[i] = evenSum;
            }

        }

        // System.out.println(Arrays.toString(odd));
        // System.out.println(Arrays.toString(even));
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (i == 0) {
                int e = odd[n - 1] - odd[i];
                int o = even[n - 1] - even[i];

                if (e == 0) {
                    count++;
                }
            } else {
                int e = even[i - 1] + odd[n - 1] - odd[i];
                int o = odd[i - 1] + even[n - 1] - even[i];
                if (e == o) {
                    count++;
                }
            }
        }
        return count;
    }
}
