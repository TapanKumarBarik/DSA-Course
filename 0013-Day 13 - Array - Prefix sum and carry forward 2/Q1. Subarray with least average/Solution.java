public class Solution {
    public int solve(int[] A, int B) {

        int sum=0;

        int n=A.length;

        for(int i=0;i<B;i++){
            sum+=A[i];
        }

        int currSum=sum;
        int index=0;
        int ans=0;

        for(int i=B;i<n;i++){

            currSum-=A[index];
            index++;
            currSum+=A[i];
            if(currSum<sum){
                ans=index;
                sum=currSum;
            }
        }

        return ans;
    }
}
