public class Solution {
    public int solve(int[] A) {

        int maxNum=Integer.MIN_VALUE;
        int minNum=Integer.MAX_VALUE;
        int res=0;
        int n=A.length;
        //find max //find min

        for(int i=0;i<n;i++){
            maxNum=Math.max(A[i],maxNum );
            minNum=Math.min(A[i],minNum);
        }
        // find all the numbers >min and <max
        for(int i=0;i<n;i++){

            if(A[i]>minNum && A[i]<maxNum){
                res++;
            }
        }
        //return 
        return res;
    }
}