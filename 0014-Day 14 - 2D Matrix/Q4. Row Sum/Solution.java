public class Solution {
    public int[] solve(int[][] A) {
        
        int n=A.length;

        int m=A[0].length;
        int []arr=new int[n];
        int index=0;

        for(int i=0;i<n;i++){

            int sum=0;
            for(int j=0;j<m;j++){
                sum+=A[i][j];
            }
            arr[index]=sum;
            index++;
        }

        return arr;
    }
}
