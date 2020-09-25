/**
 * 
 * https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1167/
 */

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {

        int M = matrix.length;
        if (M == 0)
            return new int[0];
        int N = matrix[0].length;
        int[] result = new int[M * N];
        int curr = 0;
        for (int i = 0; i < M + N - 1; i++) {
            List<Integer> diag = new ArrayList<>();
            int r;
            int c;
            if (i < N) {
                r = 0;
                c = i;
            } else {
                r = i - N + 1;
                c = N - 1;
            }

            while (c >= 0 && r < M) {
                diag.add(matrix[r][c]);
                r++;
                c--;
            }
            if (i % 2 == 0)
                Collections.reverse(diag);
            for (int x : diag) {
                result[curr++] = x;
            }


        }
        return result;
    }
}
