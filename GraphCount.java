package module13;

import java.util.*;

public class GraphCount {

    int vertices;
    List<List<Integer>> adjList;

    GraphCount(int v) {
        vertices = v;
        adjList = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u); // undirected
    }

    void countVerticesAndEdges() {

        int edgeCount = 0;

        for (int i = 0; i < vertices; i++) {
            edgeCount += adjList.get(i).size();
        }

        edgeCount = edgeCount / 2; // undirected graph

        System.out.println("Number of vertices: " + vertices);
        System.out.println("Number of edges: " + edgeCount);
    }

    public static void main(String[] args) {

        GraphCount g = new GraphCount(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);

        g.countVerticesAndEdges();
    }
}