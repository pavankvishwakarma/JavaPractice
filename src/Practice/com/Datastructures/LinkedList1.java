/* find the middle element of a list in single pass */
package Practice.com.Datastructures;

import java.util.Scanner;

class List {
	int data;
	List next;

	List(int d) {
		data = d;
		next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public List getNext() {
		return next;
	}

	public void setNext(List next) {
		this.next = next;
	}

	public String toString() {
		return "" + data + " ";
	}
}

class LinkedList {
	public List head;

	public void add(int data) {
		List l = new List(data);
		l.setNext(head);
		head = l;
	}

	public static int findMiddle(List a) {
		List slow = a;
		List fast = a;
		while (fast.getNext() != null && fast.getNext().getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow.getData();
	}
}

public class LinkedList1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the List");
		int size = s.nextInt();

		System.out.println("Enter the integers of the List");

		LinkedList ll = new LinkedList();

		for (int i = 0; i < size; i++) {
			int n = s.nextInt();

			ll.add(n);
		}

		System.out.println("the middle element is " + ll.findMiddle(ll.head));
		s.close();

	}

}
/*
OUTPUT:
Enter the size of the List
5
Enter the integers of the List
1 2 3 4 5
the middle element is 3



*/
