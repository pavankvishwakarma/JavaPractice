package com.practice.DataStructures;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
public class TopologicalSorting {
	int V;
	LinkedList<Integer> edges[];
	public TopologicalSorting(int v) {
		V=v;
		edges=new LinkedList[V];
		for (int i = 0; i < edges.length; i++) {
			edges[i]= new LinkedList();
		}
	}
	public void addEdge(int s, int d){
		edges[s].add(d);
	}
	public void printGraph(){
		for (int i = 0; i < edges.length; i++) {
			System.out.print(" "+i);
			for(int a:edges[i]){
				System.out.print("->"+a);
			}
			System.out.println();
		}
	}
	public void topologicalSort(){
		Stack<Integer> s= new Stack();
		boolean visited[]= new boolean[V];
		for (int i = 0; i < visited.length; i++) {
			if(!visited[i]){
				topologicalUtil(i,visited,s);
			}
		}

		while(!s.isEmpty()){
			System.out.print(" "+s.pop());
		}

	}

	private void topologicalUtil(int i, boolean[] visited, Stack<Integer> s) {
		visited[i]=true;
		Iterator<Integer> it = edges[i].iterator();
		while(it.hasNext()){
			int a=it.next();
			if(!visited[a]){
				topologicalUtil(a, visited, s);
			}
		}
		s.push(i);
	}
	public static void main(String[] args) {
		TopologicalSorting g = new TopologicalSorting(6); 
		g.addEdge(5, 2); 
		g.addEdge(5, 0); 
		g.addEdge(4, 0); 
		g.addEdge(4, 1); 
		g.addEdge(2, 3); 
		g.addEdge(3, 1); 
		g.printGraph();
		System.out.println("Following is a Topological " + 
				"sort of the given graph"); 
		g.topologicalSort(); 
	}
}
