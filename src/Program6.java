/* Remove Duplicates from Array Without Using Java Collection API create new Array*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program6 {
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
		removeDuplicatesInPlace(a);
		s.close();
	}
	
	public static void removeDuplicatesInPlace(int a[]){
		int temp[] = new int[a.length];
		Arrays.sort(a);
		int prev=a[0];
		int count=1;
		temp[0]=a[0];
		for (int i = 1; i < a.length; i++) {
			if(prev==a[i]){
				continue;
			}else{
				prev=a[i];
				temp[count++]=a[i];
				
			}
		}
		int b[]= new int[count];
		for (int i = 0; i < b.length; i++) {
			b[i]=temp[i];
		}
		System.out.println("New Array with no duplicates is"+Arrays.toString(b));
	}
}
/*
OUTPUT:
Enter the size of the integer
6
Enter the integers of the array
1 2 2 3 3 4
New Array with no duplicates is[1, 2, 3, 4]

*/
