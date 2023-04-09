public class Solution {
    public int[][] solve(int A) {

        int[][] a = new int[A][A];
        int n = A;

        for (int i = 0; i < n; i++) {

            int[] arr = new int[A];
            int index = 1;
            for (int j = 0; j <= i; j++) {

                arr[j] = index;
                index++;
            }
            a[i] = arr;
        }
        return a;
    }
}
