public class Solution {
    public int[][] generateMatrix(int A) {

        int[][] arr = new int[A][A];
        int count = 1;
        int rowEnd = A - 1;
        int rowBegin = 0;
        int columnBegin = 0;
        int columnEnd = A - 1;
        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {
            for (int i = columnBegin; i <= columnEnd; i++) {
                arr[rowBegin][i] = count;
                count++;
            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd; i++) {
                arr[i][columnEnd] = count;
                count++;
            }
            columnEnd--;
            for (int i = columnEnd; i >= columnBegin; i--) {
                arr[rowEnd][i] = count;
                count++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowBegin; i--) {
                arr[i][columnBegin] = count;
                count++;
            }
            columnBegin++;
        }
        return arr;
    }
}
