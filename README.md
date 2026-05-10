Assignment 4: Graph Traversal and Representation System
In this project I implemented graph traversal algorithms using adjacency list representation.
The goal was to understand how graphs work and compare BFS and DFS traversal on different graph sizes.

Algorithms used:
Breadth-First Search
Depth-First Search

Execution time was measured using System.nanoTime().

Graph Structure
A graph consists of vertices and edges.

Vertices are nodes in the graph and edges are connections between them.

The graph is represented using an adjacency list.

Classes
Vertex  
Represents a graph vertex with unique id.

Edge  
Represents a connection between two vertices.

Graph  
Stores the graph and contains BFS and DFS traversal methods.

Experiment  
Runs traversal tests and measures execution time.

Algorithms
BFS

BFS visits vertices level by level using a Queue.

Time complexity:
O(V + E)

DFS

DFS goes deeply through one path before returning back.

Time complexity:
O(V + E)

Results
Graphs tested:
- 10 vertices
- 30 vertices
- 100 vertices

Observations:
- Both algorithms were fast on small graphs
- Execution time increased with graph size
- BFS and DFS showed similar performance
- Traversal order depends on graph structure

Analysis
BFS is useful for finding the shortest path and visiting vertices level by level.

DFS is useful for deep traversal and graph analysis.

Both algorithms matched the expected complexity O(V + E).

DFS may go very deep because of recursion.

Screenshots
Program output is stored in:

docs/screenshots/

Reflection
In this assignment I learned how graph traversal algorithms work and how graphs are represented using adjacency lists.
I also understood the difference between BFS and DFS and learned how graph size affects traversal performance.
In this assignment I learned how graph traversal algorithms work and how graphs are represented using adjacency lists.

I also understood the difference between BFS and DFS and learned how graph size affects traversal performance.
