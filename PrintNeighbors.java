package module14;

import java.util.*;

public class PrintNeighbors {

    int vertices;
    List<List<Integer>> adjList;

    PrintNeighbors(int v) {
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

    void printNeighbors(int node) {

        if (node < 0 || node >= vertices) {
            System.out.println("Invalid node");
            return;
        }

        System.out.print("Neighbors of " + node + ": ");

        for (int neighbor : adjList.get(node)) {
            System.out.print(neighbor + " ");
        }
    }

    public static void main(String[] args) {

        PrintNeighbors g = new PrintNeighbors(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);

        g.printNeighbors(0);
    }
}