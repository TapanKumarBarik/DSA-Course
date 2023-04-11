public class Solution {
    public int solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;

        int j = m - 1;
        int i = 0;

        while (i < n && j >= 0) {

            if (A[i][j] == B) {
                while (j > 0 && A[i][j - 1] == B) {
                    j--;
                }
                int num = ((i + 1) * 1009);
                return num + j + 1;
            } else if (A[i][j] > B) {
                j--;
            } else {
                i++;
            }
        }

        return -1;
    }
}
