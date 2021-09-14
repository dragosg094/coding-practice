package trees_and_graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphNode {
    private int node;
    private LinkedList[] adj;

    public GraphNode(int nodes) {
        node = nodes;
        adj = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            adj[i] = new LinkedList<>();
        }

    }

    public void addEdge(int node, int newNode) {
        adj[node].add(newNode);
    }

    public boolean isReachable(int start, int end) {

        boolean[] visited = new boolean[node];

        LinkedList<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        Iterator<Integer> i;
        while (!queue.isEmpty()) {
            start = queue.poll();

            int n;
            i = adj[start].listIterator();
            while (i.hasNext()) {
                n = i.next();
                if (n == end)
                    return true;

                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        return false;
    }

}

