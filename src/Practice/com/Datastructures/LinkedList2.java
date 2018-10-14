package Practice.com.Datastructures;
/*Find loop wheather loop exists in a list or not!
 **/
import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data= data;
		next=null;
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
class LinkedListUtil{
	Node head;
	
	public void add(int data){
		Node node = new Node(data);
		node.setNext(head);
		head=node;
	}
	
	public boolean isLoopPresent(Node node){
		boolean isLoop=false;
		Node slow=node;
		Node fast=node.getNext();
		while(fast.getNext().getNext()!=null && fast.getNext()!=null){
			
			slow=slow.getNext();
			fast=fast.getNext().getNext();
			if(slow==fast){
				isLoop=true;
				break;
			}
		}
		return isLoop;
	}
	
}

public class LinkedList2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the List");
		int size = s.nextInt();
		System.out.println("Enter the integers of the List");
		LinkedListUtil ll = new LinkedListUtil();

		for (int i = 0; i < size; i++) {
			int n = s.nextInt();
			ll.add(n);
		}
		// Need to add a loop condition in main method, below code doesnt work!!   
		//ll.head.setNext(ll.head.getNext().getNext().getNext().getNext());
		
		System.out.println("Is loop present in the linkedlist? "+ll.isLoopPresent(ll.head));
	}
}
