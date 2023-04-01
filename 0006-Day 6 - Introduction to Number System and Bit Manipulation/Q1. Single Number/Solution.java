public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {

        int n=0;
        for(int i=0;i<A.length;i++){
            n=n^A[i];
        }

        return n;
    }
}
