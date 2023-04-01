public class Solution {
    public int[] solve(int[] A) {

        int n=A.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=A[i];
        }

        //xor oof 2 numbers 
        int lsb=xor & -xor;

        int xor1=0;
        int xor2=0;

        for(int i=0;i<n;i++){
            if((A[i]&lsb)==0 ){
                xor1^=A[i];
            }
            else{
                xor2^=A[i];
            }
        }

        int[]arr=new int[2];
        arr[0]=xor1;
        arr[1]=xor2;
        Arrays.sort(arr);
        return arr;
    }
}
