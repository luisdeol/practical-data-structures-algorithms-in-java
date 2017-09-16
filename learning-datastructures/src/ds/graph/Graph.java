package ds.graph;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Graph<T> {
	private Map<T, Node<T>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }
	
	public boolean containsVertex(T vertex) {
		return adjacencyList.containsKey(vertex);
	}
	
	public boolean addVertex(T vertex) {
		if (this.containsVertex(vertex))
			return false;
		
		adjacencyList.put(vertex, new Node<>(vertex));
		return true;
	}
	
	public boolean addEdge(T vertex1, T vertex2) {
		return addEdge(vertex1, vertex2, 0);
	}
	
	public boolean addEdge(T vertex1, T vertex2, int weight) {
		if (!this.containsVertex(vertex1) || !this.containsVertex(vertex2))
			throw new RuntimeException("Vertex does not exist!");
		
		Node<T> nodeA = new Node<T>(vertex1);
		Node<T> nodeB = new Node<T>(vertex1);
		
		return nodeA.addEdge(nodeB, weight);
	}
	
	public Node<T> getNode(T value){
		return adjacencyList.get(value);
	}
	
	public void printGraph() {
		for (Entry<T, Node<T>> cursor : this.adjacencyList.entrySet()) {
			System.out.println(cursor.getKey());
			for (Edge<T> edge: cursor.getValue().getEdges()) {
				System.out.println(edge.fromNode().getValue() + " -> " + edge.toNode().getValue());
			}
		}
	}
}
