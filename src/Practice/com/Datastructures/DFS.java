package Practice.com.Datastructures;
/* Only rechable nodes from the source */
import java.util.Iterator;
import java.util.LinkedList;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class DFS {

	
		int v;
		LinkedList<Integer> edges[];
		public DFS(int v) {
			this.v=v;
			edges=new LinkedList[v];
			for (int i = 0; i < edges.length; i++) {
				edges[i]=new LinkedList();
			}
		}
	
	public void addEdge(int s , int d){
		edges[s].add(d);
	}
	public void DFS(int v1){
		boolean visited[]= new boolean[v];
		DFSUtil(v1,visited);
	}
	public void DFSUtil(int v,boolean visited[]) {
		visited[v]=true;
		System.out.print(" "+v);
		Iterator<Integer> it= edges[v].listIterator();
		while(it.hasNext()){
			int a=it.next();
			if(visited[a]!=true){
			DFSUtil(a, visited);
			}
		}
		
	}
	public void printGraph(){
		for (int i = 0; i < edges.length; i++) {
			System.out.print(" "+i);
			for (int j:edges[i]) {
				System.out.print("->"+j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		DFS dfs= new DFS(4);
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 0);
		dfs.addEdge(2, 3);
		dfs.addEdge(3, 3);
		dfs.printGraph();
		
		dfs.DFS(2);
		
	}
}
