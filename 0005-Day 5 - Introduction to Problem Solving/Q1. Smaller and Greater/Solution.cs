class Solution {
    public int solve(List<int> A) {

       int resultMax = A.Max();
       int resultMin = A.Min();
       int res=0;

       for(int i=0;i<A.Count;i++){
           if(A[i]>resultMin && A[i]<resultMax){
               res++;
           }
       }

       return res;
    }
}
