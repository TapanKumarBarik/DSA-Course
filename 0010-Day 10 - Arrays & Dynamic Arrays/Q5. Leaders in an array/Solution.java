public class Solution {
    public int[] solve(int[] A) {

        int n = A.length;
        int maxTillNow = A[n - 1];

        ArrayList<Integer> arr = new ArrayList();
        arr.add(maxTillNow);
        for (int i = n - 1; i >= 0; i--) {
            if (A[i] > maxTillNow) {
                maxTillNow = A[i];
                arr.add(maxTillNow);
            }
        }

        int m = arr.size();

        int[] ar = new int[m];

        for (int i = 0; i < m; i++) {
            ar[i] = arr.get(i);
        }

        return ar;
    }
}
