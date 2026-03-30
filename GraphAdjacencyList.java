package module14;

import java.util.*;

public class GraphAdjacencyList {

    int vertices;
    List<List<Integer>> adjList;

    // Constructor
    GraphAdjacencyList(int v) {
        vertices = v;
        adjList = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add edge (Undirected Graph)
    void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    // Display adjacency list
    void display() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        GraphAdjacencyList graph = new GraphAdjacencyList(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);

        graph.display();
    }
}