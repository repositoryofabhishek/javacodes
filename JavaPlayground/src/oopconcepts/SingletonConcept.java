package oopconcepts;

public class SingletonConcept {

	// In OOP, Singleton class is a class that can have only one object(instance of class) at a time
	// How to make a Singleton Concept
	// 1. make constructor as private
	// 2. write a public static method that has return type of object of the singleton class(Lazy initialization)
	
	private static SingletonConcept singleton_instance=null; //reference variable of class
	public String str;
	
	private SingletonConcept()
	{
		str="Hey, this is singleton class pattern.";
	}
	
	public static SingletonConcept getInstance() // this method will return instance of singleton class
	{
		if(singleton_instance== null)
			singleton_instance=new SingletonConcept();
		return singleton_instance;

	
	}
	
	public static void main(String[] args) {
		SingletonConcept x= getInstance();
		SingletonConcept y=getInstance();
		SingletonConcept z=getInstance();
		x.str=(x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}
}
