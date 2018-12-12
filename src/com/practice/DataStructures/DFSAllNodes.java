package com.practice.DataStructures;
import java.util.Iterator;
import java.util.LinkedList;
public class DFSAllNodes {
	int V;
	LinkedList<Integer> edges[];
	public DFSAllNodes(int v) {
		V=v;
		edges=new LinkedList[V];
		for (int i = 0; i < edges.length; i++) {
			edges[i]=new LinkedList<>();
		}	
	}
	public void addEdge(int s, int d){
		edges[s].add(d);
	}
	
	public void printGraph(){
		for (int i = 0; i < edges.length; i++) {
			System.out.print(" "+i);
			for (int a:edges[i]) {
				System.out.print("->"+a);
			}
			System.out.println();
		}
	}
	
	public void DFSUtil(int s){
		boolean visited[]= new boolean[V];
		for (int i = s,count=0; i < visited.length&&count<visited.length; i=(i++)/visited.length,count++) {
			if(!visited[i]){
				DFS(i,visited);
			}
		}
	}
	
	private void DFS(int s,boolean visited[]) {
		visited[s]=true;
		System.out.print(" "+s);
		Iterator<Integer> it = edges[s].iterator();
		while (it.hasNext()) {
			int a=it.next();
			if(!visited[a]){
				DFS(a,visited);
			}
		}
		
	}
	public static void main(String[] args) {

		DFSAllNodes dfs= new DFSAllNodes(6);
		 dfs.addEdge(5, 2); 
	        dfs.addEdge(5, 0); 
	        dfs.addEdge(4, 0); 
	        dfs.addEdge(4, 1); 
	        dfs.addEdge(2, 3); 
	        dfs.addEdge(3, 1); 
		dfs.printGraph();
		
		dfs.DFSUtil(5);
		
	
	}
	
}
