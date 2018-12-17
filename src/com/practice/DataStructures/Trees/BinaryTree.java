package com.practice.DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	Node root;
	BinaryTree(){
		root=null;
	}
	BinaryTree(int item){
		root= new Node(item);	
	}
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root= new Node(1);
		bt.root.left=new Node(2);
		bt.root.right= new Node(3);
		bt.root.left.right=new Node(4);
		levelOrder(bt.root);
	}

	public static void levelOrder(Node root) {
		if(root==null)return;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			if(temp!=null) {
				System.out.println(temp.data);

				if(temp.left!=null) {
					queue.add(temp.left);
				}
				if(temp.right!=null){
					queue.add(temp.right);
				}
			}
		}
		}

}
