package module14;

import java.util.*;

public class ConnectedComponents {

    int vertices;
    List<List<Integer>> adjList;

    ConnectedComponents(int v) {
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

    void dfs(int node, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }

    int countComponents() {
        boolean[] visited = new boolean[vertices];
        int count = 0;

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfs(i, visited);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        ConnectedComponents g = new ConnectedComponents(6);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(3, 4);

        // Node 5 is isolated

        System.out.println("Number of connected components: " + g.countComponents());
    }
}