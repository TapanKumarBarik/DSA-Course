public class Solution {
    public int[][] solve(int[] A, int[][] B) {

        int n=A.length;

        int[][]arr=new int[B.length][2];

        for(int i=0;i<B.length;i++){

            int zeroCount=0;
            int xor=0;
            for(int j=B[i][0]-1;j<B[i][1];j++){
                if(A[j]==0){
                    zeroCount++;
                }
                xor^=A[j];
            }
           
            arr[i][0]=xor;
            arr[i][1]=zeroCount;
            
        }

        return arr;
    }
}
