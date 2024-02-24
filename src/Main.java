import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        // Зчитування графа з файлу
        File file = new File("src/graph.txt");
        Scanner scanner = new Scanner(file);
        int V = scanner.nextInt(); // Кількість вершин
        Graph graph = new Graph(V);
        int E = scanner.nextInt(); // Кількість ребер
        for (int i = 0; i < E; i++) {
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            graph.addEdge(v, w);
        }

        // Ввід початкової вершини для обходу
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Введіть початкову вершину для обходу:");
        int startVertex = inputScanner.nextInt();

        // Обхід графа пошуком в ширину
        graph.BFS(startVertex);
    }
}