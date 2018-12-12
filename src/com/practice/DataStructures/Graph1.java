package com.practice.DataStructures;
/*Array representations Adjecency matrix  */
import java.util.Arrays;

class G1{
	int vc;
	boolean adjmat[][];
	G1(int vc1){
		vc=vc1;
		adjmat=new boolean[vc][vc];
	}
	public void addEdge(int i, int j){
		if(i>=0&&j>=0&&i<vc&&j<vc){
			adjmat[i][j]=true;
			//adjmat[j][i]=true;
		}
	}
	public void removeEdge(int i, int j){
		if(i>=0&&j>=0&&i<vc&&j<vc){
			adjmat[i][j]=false;
			adjmat[j][i]=false;
		}
	}
	public boolean isEdge(int i, int j){
		if(i>=0&&j>=0&&i<vc&&j<vc){
			return adjmat[i][j];
		}else{
			return false;
		}
	}
}


public class Graph1 {
	public static void main(String[] args) {
		G1 g= new G1(4);
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		//g.addEdge(i, j);
		for (int i = 0; i < g.vc; i++) {
			System.out.println(Arrays.toString(g.adjmat[i]));
		}
	}
}
