package Practice.com.Datastructures;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
	int V;
	LinkedList<Integer> edges[];
	BFS(int v){
		V=v;
		edges=new LinkedList[V];
		for (int j = 0; j < edges.length; j++) {
			edges[j]=new LinkedList();
		}
	}
	public void addEdge(int s,int d){
		edges[s].add(d);

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

	public void BFS(int s){
		boolean visited[]= new boolean[V];
		LinkedList<Integer> queue= new LinkedList<>();
		visited[s]=true;
		queue.add(s);
		while(!queue.isEmpty()){
			int st= queue.poll();
			System.out.print(" "+st);
			Iterator<Integer> it = edges[st].listIterator();
			while(it.hasNext()){
				int n= it.next();
				if(!visited[n]){
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	}

	public static void main(String[] args) {

		BFS dfs= new BFS(4);
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 0);
		dfs.addEdge(2, 3);
		dfs.addEdge(3, 3);
		dfs.printGraph();

		dfs.BFS(2);


	}
}
