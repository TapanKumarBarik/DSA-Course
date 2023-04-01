public class Solution {
    public int numSetBits(int A) {

        int n=0;
        while (A!=0){
            n=n+ (A&1);
            A=A>>1;
        }

        return n;
    }
}
