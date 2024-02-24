import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// Клас для представлення графа
class Graph {
    private int V; // Кількість вершин
    LinkedList<Integer>[] adj; // Список суміжності

    // Конструктор
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // Додає зв'язок у граф
    void addEdge(int v,int w) {
        adj[v].add(w);
    }

    // Обхід графа пошуком в ширину
    void BFS(int s) {
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        // Початок обходу
        System.out.println("Початкова вершина: " + s);
        int level = 0; // Початковий рівень (BFS-номер)

        while (queue.size() != 0) {
            int currentVertex = queue.poll();
            System.out.println("Поточна вершина: " + currentVertex + ", BFS-номер: " + level);

            Iterator<Integer> i = adj[currentVertex].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
            level++;
        }
    }
}