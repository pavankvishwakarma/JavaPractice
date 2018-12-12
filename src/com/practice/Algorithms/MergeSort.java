package com.practice.Algorithms;

import java.util.Arrays;

public class MergeSort {

	public static void merge(int A[],int L[],int R[]) {
		int nl=L.length;
		int rl=R.length;
		int l=A.length;
		int i=0;
		int j=0;
		int k=0;
		while(i<nl&& j<rl) {
			if(L[i]<=R[j]) {
				A[k]=L[i++];
			}else {
				A[k]=R[j++];
			}
			k++;
		}
		while(i<nl) {
			A[k]=L[i];
			k++;i++;
		}
		while(j<rl) {
			A[k]=R[j];
			k++;j++;
		}
	}
	public static void mergeSort(int A[]) {
		int n=A.length;
		if(n<2)
			return;
		int mid= n/2;
		
		int nl=mid;
		int rl=n-mid;
		int L[]=new int[nl];
		int R[]=new int[rl];
		for (int i = 0; i < L.length; i++) {
			L[i]=A[i];
		}
		for (int i = mid, j=0; i < A.length; i++) {
			R[j++]=A[i];
		}
		mergeSort(L);
		mergeSort(R);
		merge(A, L, R);
		
	}
	public static void main(String[] args) {
		int A[]= {2,4,1,6,8,5,3,7};
		mergeSort(A);
		System.out.println("The sorted array is "+Arrays.toString(A));
		
	}
}
