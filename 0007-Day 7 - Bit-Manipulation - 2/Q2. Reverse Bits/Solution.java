public class Solution {
	public long reverse(long A) {

	long res=0;

    for(int i=0;i<32;i++){
        long temp=A&1;
        res=res<<1;
        res+=temp;
        A=A>>1;
    }

    return res;
	}
}
