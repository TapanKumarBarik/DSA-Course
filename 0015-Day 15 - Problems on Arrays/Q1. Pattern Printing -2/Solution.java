public class Solution {
    public int[][] solve(int A) {
        int [][]arr=new int[A][A];

        for(int i=0;i<A;i++){

            int[]arrr=new int[A];
            int index=0;
            for(int j=A-1;j>=A-1-i;j--){
                arrr[j]=index+1;
                index++;
            }
            arr[i]=arrr;
        }

        return arr;
    }
}
