public class Solution {
    public int solve(int[] A) {
        int n = A.length;

        int max = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }

        int minSize = n;
        int currSum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            // if min
            if (A[i] == min) {
                int curr = i;
                int sum = 0;
                int size = 0;

                while (curr < n && A[curr] != max) {
                    sum += A[curr];
                    curr++;
                    size++;
                }

                if (curr < n) {
                    if (A[curr] == max) {
                        size++;
                        minSize = Math.min(size, minSize);
                        currSum = Math.min(currSum, sum);
                    }
                }
            }

            // if max

            if (A[i] == max) {
                int curr = i;
                int sum = 0;
                int size = 0;

                while (curr < n && A[curr] != min) {
                    sum += A[curr];
                    curr++;
                    size++;
                }

                if (curr < n) {
                    if (A[curr] == min) {
                        size++;
                        minSize = Math.min(size, minSize);
                        currSum = Math.min(currSum, sum);
                    }
                }
            }

        }

        return minSize;

    }
}
