public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A) {

        int n = A.length;

        int[] arr = new int[n];
        int index = 0;
        for (int i = n - 1; i >= 0; i--) {
            arr[index] = A[i];
            index++;
        }
        return arr;
    }
}
