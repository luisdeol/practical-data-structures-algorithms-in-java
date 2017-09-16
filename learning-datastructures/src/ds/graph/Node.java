package ds.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Node<T>{
	private T vertex;
	private List<Edge<T>> edges;
	private Node<T> parent;
	private boolean isVisited;
	
	public Node(T vertex) {
		this.vertex = vertex;
		this.edges = new ArrayList<>();
	}
	
	public boolean addEdge(Node<T> newNode, int weight) {
		if (hasEdge(newNode))
			return false;
		Edge<T> edge = new Edge<T>(this, newNode, weight);
		return edges.add(edge);
	}
	
	public boolean hasEdge(Node<T> node) {
		return findEdge(node).isPresent();
	}
	
	public Optional<Edge<T>> findEdge(Node<T> node) {
        return edges.stream()
                .filter(edge -> edge.isBetween(this, node))
                .findFirst();
    }
	
	public T getValue() {
		return this.vertex;
	}
	
	public List<Edge<T>> getEdges(){
		return this.edges;
	}
}