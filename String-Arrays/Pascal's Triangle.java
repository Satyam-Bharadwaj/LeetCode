/*
 * https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1170/
 *
 */


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        if (numRows == 0)
            return answer;
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        answer.add(temp);
        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> newTemp = new ArrayList<>();
            newTemp.add(1);
            if (i > 1)
                for (int j = 1; j < i; j++) {
                    newTemp.add(temp.get(j) + temp.get(j - 1));
                }
            newTemp.add(1);
            answer.add(newTemp);
            temp = newTemp;
        }
        return answer;
    }
}
