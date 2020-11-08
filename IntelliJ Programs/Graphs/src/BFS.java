import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    private int V;
    private LinkedList<Integer> adj[];

    BFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int s) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[s] = true;
        q.add(s);

        while (!q.isEmpty()) {
            s = q.poll();
            System.out.print(s + " ");

            Iterator<Integer> itr = adj[s].iterator();
            while (itr.hasNext()) {
                int n = itr.next();
                if(!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS g = new BFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);
    }
}
