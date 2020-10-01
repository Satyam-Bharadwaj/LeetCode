/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3480/
 */

// since t : 1 <= t <= 104 we can use and array, however we will be probing 3000 old requests.
// better method to have a list of custom sliding window with width 3000 seconds
class RecentCounter {

    ArrayList<Integer> pingWindow;

    public RecentCounter() {
        pingWindow = new ArrayList<>();
    }

    public int ping(int t) {
        pingWindow.add(t);
        // Temp is used to keep track of position, as list will shift on deleting at pos i, if an
        // element is deleted we dont shift it, else we increment. A while loop pooling first
        // position will be more efficient
        int temp = 0;
        for (int i = 0; i < pingWindow.size(); i = temp) {
            temp = i + 1;
            if (pingWindow.get(i) + 3000 < t) {
                pingWindow.remove(i);
                temp--;
            } else {
                break;
            }
        }
        return pingWindow.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such: RecentCounter obj = new
 * RecentCounter(); int param_1 = obj.ping(t);
 */
