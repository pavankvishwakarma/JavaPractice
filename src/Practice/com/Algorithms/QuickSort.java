package Practice.com.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	public static int[] quicksort(int a[], int min, int max){
		if(min>max){
			return a;
		}
		
		int pivot=a[max];
		int index=min;
		for (int i = min; i < max; i++) {
			if(a[i]>pivot){
				continue;
			}else{
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
				index++;
			}
		}
		
		int temp1= a[max];
		a[max]=a[index];
		a[index]=temp1;
		
		
		quicksort(a,min,index-1);
		quicksort(a, index+1, max);
		
		return a;
	}
	
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
		System.out.println("Sorted Array is "+Arrays.toString(quicksort(a,0,a.length-1)));
		
	
	}
}
/*
OUTPUT:
Enter the size of the integer
8
Enter the integers of the array
11 16 2 8 1 9 4 7
Sorted Array is [1, 2, 4, 7, 8, 9, 11, 16]
*/