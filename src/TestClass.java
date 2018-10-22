import java.security.GeneralSecurityException;
import java.util.Scanner;

public class TestClass

{

	static int cntr = 0;

	TestClass()

	{
		cntr++;

		if (cntr > 2)

			throw new NullPointerException();// u can define a new exception //
												// for this

	}

	public static void main(String args[])

	{

		TestClass t1 = new TestClass();

		System.out.println("hello 1");

		TestClass t2 = new TestClass();

		System.out.println("hello 2");

		TestClass t3 = new TestClass();

	}

}

