package module14;

import java.util.*;

public class GraphInfo {

    int vertices;
    List<List<Integer>> adjList;

    GraphInfo(int v) {
        vertices = v;
        adjList = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u); // undirected graph
    }

    void countGraph() {

        int edgeCount = 0;

        for (int i = 0; i < vertices; i++) {
            edgeCount += adjList.get(i).size();
        }

        edgeCount = edgeCount / 2; // divide for undirected

        System.out.println("Number of Vertices: " + vertices);
        System.out.println("Number of Edges: " + edgeCount);
    }

    public static void main(String[] args) {

        GraphInfo g = new GraphInfo(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(3, 4);

        g.countGraph();
    }
}