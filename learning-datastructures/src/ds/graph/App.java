package ds.graph;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Graph graph = new Graph(5);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		
		graph.printAdjacents(0);
		
	}

}
