public class Solution {
    public int solve(int[] A) {
        int max=Integer.MIN_VALUE;

        int n=A.length;

        int sum=0;
        for(int i=0;i<n;i++){
            max=Math.max(max, A[i]);
            sum+=A[i];
        }

        return (max*n)-sum;
    }
}
