package gfgoopconcepts;

public class RuntimePolyConcept {
	public static void main(String[] args) {
		Parent a; //parent reference for object instantiation
		a=new Child1(); 
		a.Print(); // this will not call the method but of parent, but will call the subclass method. same happens for subclass2
		// the method in the child class which overrided the method of parent class has more priority and will be called always.
		a=new Child2();
		a.Print();
	}

}

class Parent
{
	public void Print()
	{
		System.out.println("This is parent class");
	}
}
class Child1 extends Parent{
	public void Print()
	{
		System.out.println("this is subclass 1");
	}
}
class Child2 extends Parent
{
	public void Print()
	{
		System.out.println("This is subclass 2");
	}
}