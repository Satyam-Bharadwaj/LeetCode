/***
 * https://leetcode.com/problems/keys-and-rooms/
 */

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms.size() == 1)
            return true;
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms, visited, 0);
        for (int i = 1; i < rooms.size(); i++) {
            if (!visited[i])
                return false;
        }
        return true;
    }

    private void dfs(List<List<Integer>> rooms, boolean[] visited, Integer current) {
        if (visited[current])
            return;

        visited[current] = true;
        for (Integer keys : rooms.get(current)) {
            dfs(rooms, visited, keys);
        }

    }


}
