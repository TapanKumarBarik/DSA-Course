public class Solution {
    public int[] solve(int[] A) {

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int n=A.length;
        int[]arr=new int[n-2];
        //find max1

        for(int i=0;i<n;i++){
            max1=Math.max(max1, A[i]);
        }

        //find max2

        for(int i=0;i<n;i++){
            if(A[i]!=max1){
                max2=Math.max(max2, A[i]);
            }
        }

        int index=0;
        for(int i=0;i<n;i++){
            if(A[i]==max1 || A[i]==max2){
                continue;
            }
            else{
                arr[index]=A[i];
                index++;
            }
        }
        return arr;
    }
}
