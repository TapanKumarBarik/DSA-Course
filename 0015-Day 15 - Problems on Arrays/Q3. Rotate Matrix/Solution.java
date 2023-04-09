public class Solution {
    public void solve(int[][] A) {

        int n = A.length;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        //
        for (int i = 0; i < n; i++) {
            reverse(A[i], 0, n - 1);
        }

    }

    private void reverse(int[] arr, int i, int j) {

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
