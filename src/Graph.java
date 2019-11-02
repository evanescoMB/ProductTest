import java.util.ArrayList;
import java.util.List;

public class Graph {

    private final int V;
    private int E;
    private List<Integer>[] adj;

    public Graph(int v) {
        if(v < 0)
            throw new IllegalArgumentException();
        this.V = v;
        this.E = 0;
        adj = (ArrayList[]) new ArrayList[v];
        for(int k=0; k<v; k++)
            adj[k] = new ArrayList<Integer>();
    }

    public int numOfVerticies() {
        return V;
    }

    public int numOfEdges() {
        return E;
    }

    public void addEdge(int v, int w) {
        validateVertex(v);
        validateVertex(w);
        E++;
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v) {
        validateVertex(v);
        return adj[v];
    }

    public int degree(int v) {
        validateVertex(v);
        return adj[v].size();
    }

    private void validateVertex(int v) {
        if (v < 0 || v >= V)
            throw new IllegalArgumentException();
    }

}
