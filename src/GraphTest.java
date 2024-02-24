import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    @Test
    void testAddEdge() {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 0);

        // Перевірка, чи дійсно додані ребра
        assertTrue(g.adj[0].contains(1));
        assertTrue(g.adj[1].contains(2));
        assertTrue(g.adj[2].contains(3));
        assertTrue(g.adj[3].contains(4));
        assertTrue(g.adj[4].contains(0));
    }
}
