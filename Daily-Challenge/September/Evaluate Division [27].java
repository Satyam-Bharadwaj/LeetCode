/*
 * 
 * https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/557/week-4-september-
 * 22nd-september-28th/3474/
 * 
 */

class Solution {

    class Vertex {
        String label;
        double val;
        List<Vertex> adjVertices;

        public Vertex(String word, double val) {
            this.label = word;
            this.val = val;
            adjVertices = new ArrayList<>();
        }
    }

    HashMap<String, Vertex> vertices;

    public double[] calcEquation(List<List<String>> equations, double[] values,
            List<List<String>> queries) {
        vertices = new HashMap<>();


        for (int i = 0; i < equations.size(); i++) {
            List<String> current = equations.get(i);
            String nr = current.get(0);
            String dr = current.get(1);
            Vertex n = new Vertex(nr, 1.0 / values[i]);
            Vertex d = new Vertex(dr, values[i]);
            if (!vertices.containsKey(nr)) {
                vertices.put(nr, n);
                n.adjVertices.add(d);
            } else {

                vertices.get(nr).adjVertices.add(d);

            }
            if (!vertices.containsKey(dr)) {
                vertices.put(dr, d);
                d.adjVertices.add(n);
            } else {
                vertices.get(dr).adjVertices.add(new Vertex(nr, 1.0 / values[i]));

            }

        }

        double[] response = new double[queries.size()];

        // queries here:
        for (int i = 0; i < queries.size(); i++) {
            List<String> current = queries.get(i);
            String nr = current.get(0);
            String dr = current.get(1);
            if (!vertices.containsKey(nr) || !vertices.containsKey(dr)) {
                response[i] = -1.0;
            } else if (nr.equals(dr)) {
                response[i] = 1.0;
            } else {
                // perform dfs search from src to target
                HashSet<String> visited = new HashSet<>();
                response[i] = dfs(nr, dr, visited);
            }
        }
        return response;


    }

    private double dfs(String current, String destination, HashSet<String> visited) {
        if (visited.contains(current)) {
            return -1.0;
        }
        if (current.equals(destination)) {
            return 1.0;
        }
        visited.add(current);
        for (Vertex v : vertices.get(current).adjVertices) {

            double dfsVal = dfs(v.label, destination, visited);
            if (dfsVal != -1) {
                return dfsVal * v.val;
            }

        }
        return -1.0;
    }
}
