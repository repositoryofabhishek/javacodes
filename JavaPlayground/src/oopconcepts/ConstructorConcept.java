package oopconcepts;

public class ConstructorConcept {
	
	public static void main(String[] args) {
		ConstructorConcept cc=new ConstructorConcept();
		ConstructorConcept cc1=new ConstructorConcept(11);
		ConstructorConcept cc2=new ConstructorConcept("Tom", 25); 	
	}

	public ConstructorConcept()
	{
		System.out.println("Default Constructor");
	}
	public ConstructorConcept(int i)
	{
		System.out.println("One parameter Constructor.");
		System.out.println("Value is "+i);
	}
	public ConstructorConcept(String name, int age)
	{
		System.out.println("Parameterized Constructor");
		System.out.println("Name is "+name+" and age is "+age);
	}
}
