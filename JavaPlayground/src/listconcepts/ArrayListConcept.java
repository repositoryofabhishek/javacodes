package listconcepts;

import java.util.ArrayList;
import java.util.Iterator;

//Static array has fixed size. 
//ArrayList is a dynamic array.Size doesn't matter in this concept. 
//ArrayList is a default class present in java library, in java.util

/**
 * @author Abhishek
 *1. maintains insertion order
 2. Arraylist can contain duplicate elements
 3.Arraylist can contain duplicate elements.
 4. It is not syncronized, not thread safe. means it is slow.
 5. It allows random access to fetch any element, because it stores the values on the basis of indexes.
 */
public class ArrayListConcept {
	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40); 
		//System.out.println(ar.size());
		ar.add(40); 
		//System.out.println(ar.size());
	// to print all the values of arraylist
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("*************");
		
		//non generic vs generic
		// Generic is basically, specifying the arraylist for only one particular value like string, integer. ArrayList<Integer> this is generics and only integers will be stored in arraylist now.


		
		// Employee class objects will be created.
		Employee e1=new Employee("Abhishek", 27, "CSE");
		Employee e2=new Employee("Tom", 25, "QA");
		Employee e3=new Employee("Peter", 24, "Design");
		
		//create arraylist
		ArrayList<Employee> arrLis=new ArrayList<Employee>(); // this arraylist is type of employee now
		arrLis.add(e1);
		arrLis.add(e2);
		arrLis.add(e3);
		
		Iterator<Employee> itr=arrLis.iterator();
		while(itr.hasNext())
		{
			Employee emp=itr.next();
			System.out.println(emp.name+" "+emp.age+" "+emp.dept);
			
		}
		
		System.out.println("**************************");
		//addall method
		ArrayList<String> arr=new ArrayList<String>(); // this is generic arraylist
		arr.add("Java");
		arr.add("Selenium");
		arr.add("QTp");
		
		ArrayList<String> arrs=new ArrayList<String>(); // this is generic arraylist
		arrs.add("dev");
		arrs.add("design");
		arrs.add("QTp");
		
		//to add second list in first list.
		//arr.addAll(arrs);
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
//		arr.removeAll(arrs);
//		System.out.println("********************");
//		for(int i=0;i<arr.size();i++)
//		{
//			System.out.println(arr.get(i));
//		}
		System.out.println("**************8");
		arr.retainAll(arrs); // this will only give the common values from both the arrays
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		
	}
}
