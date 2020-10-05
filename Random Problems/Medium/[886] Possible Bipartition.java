/**
 * Not the cleanest Impl, have to improve the readability aspect...
 * 
 * https://leetcode.com/problems/possible-bipartition/
 */


class Solution {
    class Vertex {
        int color;
        ArrayList<Vertex> adjList;
        int val;

        public Vertex(int value) {
            val = value;
            adjList = new ArrayList<>();
        }
    }

    HashMap<Integer, Vertex> graph;

    public boolean possibleBipartition(int N, int[][] dislikes) {
        if (N < 3)
            return true;
        graph = new HashMap<>();
        for (int[] pair : dislikes) {

            Vertex v1 = graph.getOrDefault(pair[0], new Vertex(pair[0]));
            v1.adjList.add(new Vertex(pair[1]));
            graph.put(pair[0], v1);
            Vertex v2 = graph.getOrDefault(pair[1], new Vertex(pair[1]));
            v2.adjList.add(new Vertex(pair[0]));
            graph.put(pair[1], v2);
        }
        for (int i = 1; i < N; i++) {
            if (!graph.containsKey(i))
                continue;

            if (graph.get(i).color == 0 && !colorgraph(i, 1)) {
                return false;
            }
        }
        return true;



    }

    private boolean colorgraph(int currentVertex, int lastColor) {
        if (graph.get(currentVertex).color != 0)
            return graph.get(currentVertex).color != lastColor;



        graph.get(currentVertex).color = lastColor == 1 ? 2 : 1;

        for (Vertex v : graph.get(currentVertex).adjList) {

            if (!colorgraph(v.val, (lastColor == 1 ? 2 : 1)))
                return false;


        }
        return true;
    }
}
