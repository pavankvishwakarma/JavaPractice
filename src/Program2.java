import java.util.Scanner;

/*Find the second largest in an un sorted array of integers */
public class Program2 {
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
		System.out.println(Integer.MIN_VALUE==secondLargest(a)?"Second largest doesnt exist":secondLargest(a));
		
	
	}

	public static int secondLargest(int[] a) {
		
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(max<a[i]){
				smax=max;
				max=a[i];
			}
			if(smax<a[i]&&!(max<=a[i])){
				smax=a[i];
			}
			
		}
		
		return smax;
	}
}
/*
OUTPUT:
Enter the size of the integer
7
Enter the integers of the array
12 1 3 9 2 10 7
10

*/