package oopconcepts;

public class B extends A{

	public B() {
		super(10); // you have to explicitly call the parent class constructor with the value 
		// and super keyword should be called at very first position. it will always be the first statement.
		System.out.println("Class B Constructor");
	}
	
	public static void main(String[] args) {
		B obj=new B(); // first it will check the parent class constructor and then will call child class constructor afterwards
	}
}
