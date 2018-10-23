import java.security.GeneralSecurityException;
import java.util.Scanner;

public class TestClass

{
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i = 2,count=0; i < 5 && count<5; i=(i+1)%5,count++) {
			System.out.print(i+" ");
		}
	}
}
