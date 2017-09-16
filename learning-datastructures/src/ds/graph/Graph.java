package ds.graph;

import java.util.ArrayList;

public class Graph {
	private ArrayList[] adjacents;
	private int vCount;
	private int eCount;
	public Graph(int vCount) {
		this.vCount = vCount;
		this.eCount = 0;
		adjacents = new ArrayList[vCount];
		
		for (int i=0; i<vCount; i++)
			adjacents[i]=new ArrayList<Integer>();
	}
	
	public int getVertexCount() {
		return this.vCount;
	}
	
	public int getEdgeCount() {
		return this.eCount;
	}
	
	public void addEdge(int source, int destination) {
		adjacents[source].add(destination);
		eCount++;
	}
	
	public ArrayList<int[]> adj(int source) {
		return adjacents[source];
	}
	
	public void printAdjacents(int source) {
		System.out.println("------- Adjacents of "+source+"--------\n");
		for(int i=0; i<adjacents[source].size(); i++)
			System.out.println(adjacents[source].toArray()[i]);
	}
}
