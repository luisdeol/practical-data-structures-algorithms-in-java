package ds.graph;

public class App {

	public static void main(String[] args) {
		Graph<Integer> graph = new Graph<Integer>();
		
		graph.addVertex(0);
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(4);
		
		Node nodeA = graph.getNode(0);
		nodeA.addEdge(new Node(1), 0);
		nodeA.addEdge(new Node(2), 0);
		nodeA.addEdge(new Node(3), 0);
		
		Node nodeB = graph.getNode(1);
		
		nodeB.addEdge(new Node(1), 0);
		nodeB.addEdge(new Node(4), 0);
		
		graph.printGraph();
		
	}

}
