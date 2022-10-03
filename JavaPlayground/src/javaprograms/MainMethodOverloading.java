package javaprograms;

public class MainMethodOverloading {
	public static void main(String[] args) {
			main(10);
			main("Abhishek");
		
	}

	public static void main(int a) {
		System.out.println("Main with integer value of "+a);
	}
	public static void main(String s)
	{
		System.out.println("Main method with string value of "+s);
	}
}
