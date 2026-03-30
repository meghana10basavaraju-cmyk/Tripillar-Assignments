package module14;

import java.util.*;

public class DFSGraph {

    int vertices;
    List<List<Integer>> adjList;
    boolean[] visited;

    DFSGraph(int v) {
        vertices = v;
        adjList = new ArrayList<>();
        visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); // undirected
    }

    void DFS(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                DFS(neighbor);
            }
        }
    }

    public static void main(String[] args) {

        DFSGraph g = new DFSGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);

        System.out.print("DFS Traversal: ");
        g.DFS(0);
    }
}