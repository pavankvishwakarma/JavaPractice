import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* find the pairs of a given number in an array */
public class Program3 {
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
		System.out.println("Enter the sum");
		int sum= s.nextInt();
		findPairOfSum(a,sum);
		
	}
	
	public static void findPairOfSum(int a[], int sum){
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			int sub = sum-a[i];
			if(!set.contains(sub)){
				set.add(a[i]);
			}else{
				System.out.println("the pair "+a[i]+" "+sub );
			}
		}
		
	}
	
}

/*
OUTPUT:
Enter the size of the integer
7
Enter the integers of the array
2 4 3 5 7 8 9
Enter the sum
7
the pair 3 4
the pair 5 2


*/
