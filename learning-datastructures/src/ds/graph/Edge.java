package ds.graph;

public 	class Edge<T>{
	private Node<T> nodeA;
	private Node<T> nodeB;
	private int weight;
	
	public Edge(Node<T> nodeA, Node<T> nodeB, int weight) {
		this.nodeA = nodeA;
		this.nodeB = nodeB;
		this.weight = weight;
	}
	
	public Node<T> fromNode(){
		return nodeA;
	}
	
	public Node<T> toNode(){
		return nodeB;
	}
	
	public boolean isBetween(Node<T> nodeA, Node<T> nodeB) {
		return (this.nodeA == nodeA && this.nodeB == nodeB);
	}
}