
/*How do you find the duplicate number on a given integer array?*/

import java.util.HashMap;
import java.util.Scanner;

public class Program1 {
	
	public static int duplicateInteger(int a[]){
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if(hm.containsKey(a[i])){
				return a[i];
			}else{
				hm.put(a[i], 1);
			}
			
		}
		return -1;
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
		System.out.println(-1==duplicateInteger(a)?"No duplicate":duplicateInteger(a));
		
	}
}


/*Output
Enter the size of the integer
5
Enter the integers of the array
1 2 7 3 3
3*/
