public class TLE {
    public int solve(int[] A) {

        int n = A.length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int x = Math.abs(A[i] - A[j]);

                if (x < min) {
                    min = x;
                }
            }
        }

        return min;
    }
}
