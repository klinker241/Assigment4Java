public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();

        // create vertices
        for(int i = 0; i < 10; i++) {
            graph.addVertex(new Vertex(i));
        }

        // create edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 6);
        graph.addEdge(4, 7);
        graph.addEdge(5, 8);
        graph.addEdge(6, 9);

        // example edge object
        Edge edgeExample = new Edge(0, 1);

        System.out.println("Example Edge: " + edgeExample);

        System.out.println("\nGraph Structure:");
        graph.printGraph();

        Experiment experiment = new Experiment();

        System.out.println("\nTraversal Results:");
        experiment.runTraversals(graph);

        System.out.println("\nPerformance Tests:");
        experiment.runMultipleTests();

        experiment.printResults();
    }
}