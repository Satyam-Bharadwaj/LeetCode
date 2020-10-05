/**
 * 
 * https://leetcode.com/problems/random-flip-matrix/
 */

class Solution {
    Set<Integer> set;
    int m;
    int n;

    public Solution(int n_rows, int n_cols) {
        set = new HashSet<>();
        m = n_rows;
        n = n_cols;
    }

    public int[] flip() {
        int[] sol = new int[2];
        do {
            int rand = (int) (Math.random() * (n * m));
            int rand_x = rand / n;
            int rand_y = rand % n;
            if (!set.contains(rand)) {
                set.add(rand);

                sol[0] = rand_x;
                sol[1] = rand_y;
                return sol;
            }
        } while (true);
    }

    public void reset() {
        set.clear();
    }
}

/**
 * Your Solution object will be instantiated and called as such: Solution obj = new Solution(n_rows,
 * n_cols); int[] param_1 = obj.flip(); obj.reset();
 */
