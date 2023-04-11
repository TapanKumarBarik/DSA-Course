public class Solution {
    public int solve(String A) {

        int totalOne = 0;
        int n = A.length();
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '1') {
                totalOne++;
            }
        }
        int maxAns = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int zero = 1;
            int j = i;
            while (zero > -1 && j < n) {
                if (A.charAt(j) == '1') {
                    count++;
                } else {
                    zero--;
                }
                j++;
            }
            maxAns = Math.max(count, maxAns);
        }
        if (maxAns == totalOne) {
            return maxAns;
        }
        return maxAns + 1;
    }
}
