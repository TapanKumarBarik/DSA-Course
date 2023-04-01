public class Solution {
    public String addBinary(String A, String B) {

        StringBuilder sb=new StringBuilder();

        int n=A.length()-1;
        int m=B.length()-1;
        int carry=0;


        while(n>=0 && m>=0){
            int num1=A.charAt(n)-'0';
            int num2=B.charAt(m)-'0';
            int sum=num1+num2+carry;
             carry=sum/2;
            sb.append(sum%2);
            n--;
            m--;
        }

        while(n>=0){
             int num1=A.charAt(n)-'0';
            int sum=num1+carry;
             carry=sum/2;
            sb.append(sum%2);
            n--;
        }

        while(m>=0){
            int num2=B.charAt(m)-'0';
            int sum=num2+carry;
             carry=sum/2;
            sb.append(sum%2);
            m--;
        }

        if(carry!=0){
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
