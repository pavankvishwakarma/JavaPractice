/* Remove Duplicates from Array in place Without Using Java Collection API*/


import java.util.Arrays;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the integer");
		int size = s.nextInt();
		System.out.println("Enter the integers of the array");
		int a[]=new int[size];
		for (int i = 0; i < size; i++) {
			int n= s.nextInt();
			a[i]= n;
		}
		System.out.println("array with removed duplicates "+Arrays.toString(removeDuplicatesInPlace(a)));
		s.close();
	}
	
	public static int[] removeDuplicatesInPlace(int a[]){
		Arrays.sort(a);
		int prev=a[0];
		for (int i = 1; i < a.length; i++) {
			if(prev==a[i]){
				a[i]=0;
			}else{
				prev=a[i];
			}
		}
		return a;
		
	}
}
/*
OUTPUT:
Enter the size of the integer
6
Enter the integers of the array
1 2 2 3 3 4
array with removed duplicates [1, 2, 0, 3, 0, 4]

*/
