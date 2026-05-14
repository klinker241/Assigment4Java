public class Experiment {

    public void runTraversals(Graph g) {

        System.out.println("BFS Traversal:");

        long startBfs = System.nanoTime();

        g.bfs(0);

        long endBfs = System.nanoTime();

        System.out.println("BFS Time: " + (endBfs - startBfs) + " ns");

        System.out.println();

        System.out.println("DFS Traversal:");

        long startDfs = System.nanoTime();

        g.dfs(0);

        long endDfs = System.nanoTime();

        System.out.println("DFS Time: " + (endDfs - startDfs) + " ns");
    }

    public void runMultipleTests() {

        int[] sizes = {10, 30, 100};

        for(int size : sizes) {

            System.out.println("\nGraph Size: " + size);

            Graph g = new Graph();

            for(int i = 0; i < size; i++) {
                g.addVertex(new Vertex(i));
            }

            for(int i = 0; i < size - 1; i++) {
                g.addEdge(i, i + 1);
            }

            runTraversals(g);
        }
    }

    public void printResults() {
        System.out.println("\nExperiments completed.");
    }
}