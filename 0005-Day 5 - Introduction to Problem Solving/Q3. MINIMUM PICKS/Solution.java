// Do not write code to include libraries, main() function or accept any input from the console.
// Initialization code is already written and hidden from you. Do not write code for it again.
public class Solution {
    public int solve(int[] A) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
       
       int evenMax=Integer.MIN_VALUE;
       int oddMin=Integer.MAX_VALUE;

       int n=A.length;

       for(int i=0;i<n;i++){
           if((A[i]&1)==0 )//even
           {
               evenMax=Math.max(evenMax, A[i]);
           }
           else{
               oddMin=Math.min(oddMin, A[i]);
           }
       }

       return evenMax-oddMin;

    }
}
