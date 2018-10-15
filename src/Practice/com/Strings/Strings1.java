package Practice.com.Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;

/* Print duplicte characters from a stings  */
public class Strings1 {
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = s.nextLine();
		//printUniqueCharacters(str);
		//printDuplicates(str);
		//firstNonRepeating(str);
		//System.out.println(reverseRecurse(str));
		findOccurrensesCount(str);

	}
	/*	Print all unique characters from a string  */
	public static void printUniqueCharacters(String str){
		char[] strArr = str.toCharArray();
		Arrays.sort(strArr);
		int i=1;
		char prev=strArr[0];
		System.out.println(prev);
		while(i<strArr.length){
			if(prev==strArr[i]){
				i++;
				continue;
			}else{
				System.out.println(strArr[i]);
				prev=strArr[i++];
			}
		}
	}

	/*Print all duplicate characters in a sting	*/
	public static void printDuplicates(String str){
		char[] strArr = str.toCharArray();
		int i=1;
		char prev=strArr[0];
		while(i<strArr.length){
			if(prev==strArr[i]){
				System.out.println(strArr[i++]);
				continue;
			}else{
				prev=strArr[i++];
			}
		}
	}

	/*Find the first non repeating character	*/
	public static void firstNonRepeating(String str){
		HashMap<Character, Integer> hm = new LinkedHashMap<>();
		char[] strArr= str.toCharArray();
		for (int i = 0; i < strArr.length; i++) {
			if(hm.containsKey(strArr[i])){
				hm.put(strArr[i], hm.get(strArr[i])+1);
			}else{
				hm.put(strArr[i], 1);
			}
		}
		for (java.util.Map.Entry<Character, Integer> e :hm.entrySet()) {
			if(e.getValue()==1){
				System.out.println("the first non repeating character is "+e.getKey());
				break;
			}
		}

	}
	/* Reverse a string using recursion */
	public static String reverseRecurse(String str){
		if(str.length()<=0){
			return "";
		}
		return str.substring(str.length()-1)+reverseRecurse(str.substring(0, str.length()-1));
	}

	/*Count Occurences of a given string   */
	public static void findOccurrensesCount(String str){

		int count[]=new int[265];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
		for (int i = 0; i < count.length; i++) {
			if(count[i]!=0){
				System.out.println((char)i+ " " + count[i]);
			}
		}
	}

}
