package com.practice.Strings;

import java.util.Arrays;
import java.util.Scanner;

/* Print duplicte characters from a stings  */
public class Strings2 {
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter your string1");
		String str1 = s.nextLine();
		
		System.out.println("Enter your string1");
		String str2 = s.nextLine();
		Anagrams(str1, str2);
		//System.out.println("Are given strings are anagrams? "+);
	}

/*check if two strings are anagrams	*/
	public static void Anagrams(String str1,String str2){
		char[] str1Arr=str1.toCharArray();
		char[] str2Arr=str2.toCharArray();
		Arrays.sort(str1Arr);
		Arrays.sort(str2Arr);
		System.out.println(Arrays.equals(str1Arr, str2Arr));
	}
	
}
