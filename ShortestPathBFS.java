package module14;

import java.util.*;

public class ShortestPathBFS {

    int vertices;
    List<List<Integer>> adjList;

    ShortestPathBFS(int v) {
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

    void shortestPath(int start) {

        boolean[] visited = new boolean[vertices];
        int[] distance = new int[vertices];

        Arrays.fill(distance, -1);

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        distance[start] = 0;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : adjList.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    distance[neighbor] = distance[node] + 1;
                    queue.add(neighbor);
                }
            }
        }

        // Print shortest distances
        for (int i = 0; i < vertices; i++) {
            System.out.println("Distance from " + start + " to " + i + " = " + distance[i]);
        }
    }

    public static void main(String[] args) {

        ShortestPathBFS g = new ShortestPathBFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);

        g.shortestPath(0);
    }
}