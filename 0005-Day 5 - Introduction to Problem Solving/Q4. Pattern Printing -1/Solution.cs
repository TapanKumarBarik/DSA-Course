class Solution {
    public List<List<int>> solve(int A) {

        List<List<int>>arr=new List<List<int>>();
        
        for(int i=0;i<A;i++){
            List<int>ar=new List<int>();
            for(int j=0;j<A;j++){
               if(j<=i){
                    ar.Add(j+1);
               }
               else{
                    ar.Add(0);
               }
            }
            arr.Add(ar);
        }

        return arr;
    }
}
