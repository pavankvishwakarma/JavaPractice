package com.practice.DataStructures;

import java.util.Scanner;

/*Reverse linked list  */
public class LinkedList3 {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
					
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}
	static class LinkedList{
		Node head;
		
		public void add(int data){
			Node node = new Node(data);
			node.setNext(head);
			head =node;
		}
		
		public void reverseLinkedList(Node node){
			Node f=node;
			Node s=node.getNext();
			Node t=node.getNext().getNext();
			
			while(t!=null){
				s.setNext(f);
				f=s;
				s=t;
				t=t.getNext();
				
			}
			head.setNext(null);
			head=s;
		}
		public void printAllNodes(Node h){
			Node temp= h;
			while(temp.getNext()!=null){
				System.out.println(temp.data);
				temp.setNext(temp.getNext());
			}
		}
		
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the List");
		int size = s.nextInt();
		System.out.println("Enter the integers of the List");
		LinkedList3.LinkedList ll = new LinkedList3.LinkedList();

		for (int i = 0; i < size; i++) {
			int n = s.nextInt();
			ll.add(n);
		}
		//need to write a program to reverse by recursion as well!
		//refer:https://simpleprogrammer.com/programming-interview-questions/
		ll.reverseLinkedList(ll.head);
		ll.printAllNodes(ll.head);
	
	}

}
