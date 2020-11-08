import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    private int V;
    private LinkedList<Integer> adj[];

    DFS(int v) {
        V = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSTraversalUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> itr = adj[v].listIterator();

        while (itr.hasNext()) {
            int n = itr.next();
            if(!visited[n]) {
                DFSTraversalUtil(n, visited);
            }
        }
    }

    void DFSTraversal() {
        boolean visited[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                DFSTraversalUtil(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS g = new DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.DFSTraversal();
    }
}
