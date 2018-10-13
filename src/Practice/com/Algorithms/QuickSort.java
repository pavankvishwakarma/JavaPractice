package Practice.com.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	public static int[] quicksort(int a[], int min, int max){
		if(a.length<2){
			return a;
		}
		
		int pivot=a[a.length-1];
		int index=0;
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
		min=
		quicksort(a);
		
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
		System.out.println(Arrays.toString(quicksort(a)));
		
	
	}
}
