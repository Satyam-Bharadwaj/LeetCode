/***
 * 
 * https://leetcode.com/problems/reconstruct-itinerary/
 */

class Solution {
    int ticketsSize;

    public List<String> findItinerary(List<List<String>> tickets) {
        ticketsSize = tickets.size() + 1;
        // sort based on destination
        Collections.sort(tickets, (ticket1, ticket2) -> {
            return (ticket1.get(1)).compareTo(ticket2.get(1));
        });

        Map<String, List<String>> graph = new HashMap<>();
        // construct graph
        for (List<String> ticket : tickets) {

            List<String> val = graph.getOrDefault(ticket.get(0), new ArrayList<>());
            val.add(ticket.get(1));
            graph.put(ticket.get(0), val);

        }
        List<String> sol = new LinkedList<>();
        dfs("JFK", graph, sol);

        return sol;
    }

    private void dfs(String current, Map<String, List<String>> graph, List<String> sol) {
        if (sol.size() == ticketsSize)
            return;


        List<String> edge = graph.get(current);
        while (edge != null && edge.size() != 0) {

            dfs(edge.remove(0), graph, sol);
        }
        sol.add(0, current);
    }

}
