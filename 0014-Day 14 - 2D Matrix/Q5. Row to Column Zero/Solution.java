public class Solution {
    public int[][] solve(int[][] A) {

        int n = A.length;
        int col = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 0) {
                    if (i == 0) {
                        col = 0;
                    } else {
                        A[i][0] = 0;
                        A[0][j] = 0;
                    }
                }
            }
        }

        //

        for (int i = n - 1; i >= 0; i--) {

            for (int j = A[0].length - 1; j >= 0; j--) {

                if (i == 0 && col == 0) {
                    A[i][j] = 0;
                }
                if (i != 0 && (A[i][0] == 0 || A[0][j] == 0)) {
                    A[i][j] = 0;
                }
            }
        }

        return A;
    }
}
