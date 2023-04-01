public class Solution {
    public int[][] solve(int A) {

        int[][]arr=new int[A][A];
        for(int i=0;i<A;i++){
            for(int j=0;j<=i;j++){
                arr[i][j]=j+1;
            }
        }

        return arr;
    }
}
