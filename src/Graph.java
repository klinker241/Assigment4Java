import java.util.*;

public class Graph {

    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    // add vertex
    public void addVertex(Vertex v) {
        adjList.putIfAbsent(v.getId(), new ArrayList<>());
    }

    // add edge (undirected graph)
    public void addEdge(int from, int to) {

        adjList.get(from).add(to);
        adjList.get(to).add(from);
    }

    // print graph
    public void printGraph() {

        for(int vertex : adjList.keySet()) {

            System.out.print(vertex + " -> ");

            for(int neighbor : adjList.get(vertex)) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }

    // BFS traversal
    public void bfs(int start) {

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while(!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for(int neighbor : adjList.get(current)) {

                if(!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    // DFS traversal
    public void dfs(int start) {

        Set<Integer> visited = new HashSet<>();

        dfsHelper(start, visited);

        System.out.println();
    }

    private void dfsHelper(int vertex, Set<Integer> visited) {

        visited.add(vertex);

        System.out.print(vertex + " ");

        for(int neighbor : adjList.get(vertex)) {

            if(!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }
}