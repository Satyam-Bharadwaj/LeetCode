/**
 * https://leetcode.com/problems/number-of-islands/
 */
// Ask if allowed to modify the array
// In that case there will be no requirement for visited array.
class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0)
            return 0;

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] != '0') {
                    dfs(i, j, visited, grid);
                    count++;
                }
            }
        }
        return count;


    }

    private void dfs(int x, int y, boolean[][] visited, char[][] grid) {

        if (x < 0 || x >= visited.length)
            return;
        if (y < 0 || y >= visited[0].length)
            return;
        if (visited[x][y] || grid[x][y] == '0')
            return;

        visited[x][y] = true;
        dfs(x - 1, y, visited, grid);
        dfs(x, y - 1, visited, grid);
        dfs(x + 1, y, visited, grid);
        dfs(x, y + 1, visited, grid);

    }


}
