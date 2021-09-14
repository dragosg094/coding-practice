package trees_and_graphs;


public class RouteBetweenNodes {


    public static void main(String[] args) {
        GraphNode g = new GraphNode(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        int start = 1;
        int end = 3;
        if (g.isReachable(start, end)) {
            System.out.println("There is a path from " + start + " to " + end);
        } else {
            System.out.println("There is no path from " + start + " to " + end);
        }
        start = 3;
        end = 1;
        if (g.isReachable(start, end)) {
            System.out.println("There is a path from " + start + " to " + end);
        } else {
            System.out.println("There is no path from " + start + " to " + end);
        }
    }
}
