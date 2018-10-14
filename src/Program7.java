import java.util.Scanner;

/*Remove duplicates and update in the same array  */
public class Program7 {
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
		int n =removeDuplicatesInPlace(a);
		System.out.print("the sorted Array is ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
		s.close();

	}

	private static int removeDuplicatesInPlace(int[] a) {

		int j=1;
		int prev=a[0];
		for (int i = 1; i < a.length; i++) {
			if(prev==a[i]){
				continue;
			}else{
				prev=a[i];
				a[j++]=a[i];
			}
		}

		return j;
	}
}
/*
OUTPUT:
Enter the size of the integer
9
Enter the integers of the array
1 2 2 3 4 4 4 5 5
the sorted Array is 1 2 3 4 5 
*/
