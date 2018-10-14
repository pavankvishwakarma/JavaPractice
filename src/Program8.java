import java.util.Arrays;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.model.util.ArrayInfoUtil;

/* Reverse an array in place */
public class Program8 {
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
		reverseArrays(a);
		s.close();

	
	}

	private static void reverseArrays(int[] a) {
		
		int i =0;
		int j=a.length-1;
		while(i<j){
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			
		}
		System.out.println("The reversed Array is "+Arrays.toString(a));
	}
}
/*
OUTPUT:
Enter the size of the integer
6
Enter the integers of the array
1 2 3 4 5 6
The reversed Array is [6, 5, 4, 3, 2, 1]


*/