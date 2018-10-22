package Practice.com.Datastructures;

import java.util.LinkedList;

/* Adjacency form of graph representaion  */
public class Graph2 {
	public static class G2{
		int V;
		LinkedList<Integer> edges[] ;
		G2(int v){
			V=v;
			edges = new LinkedList[V];
			for (int i = 0; i < edges.length; i++) {
				edges[i]=new LinkedList<>();
			}
		}
		
		
	}
	public void addEdge(G2 g,int s, int d){
		g.edges[s].add(d);
		g.edges[d].add(s);
	}
	public void printGraph(G2 g){
		System.out.println("the graph looks like ");
		for (int i = 0; i < g.V; i++) {
			System.out.print("For "+i+" = ");
			for(int in : g.edges[i]) {
				System.out.print(" -> "+in);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		G2 g = new G2(5);
		Graph2 graph = new Graph2();
		graph.addEdge(g, 0, 1);
		graph.addEdge(g, 0, 4);
		graph.addEdge(g, 1, 2);
		graph.addEdge(g, 1, 3);
		graph.addEdge(g, 1, 4);
		
		;
		graph.addEdge(g, 2, 3);
		
		
		graph.addEdge(g, 3, 4);
		
		
		

		graph.printGraph(g);
		
	}
}
