package listconcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<>();
	ll.add("Selenium");
	ll.add("Java");
	ll.add("QTP");
	//System.out.println("Content of linked list is "+ll);
	//add at first position 
	ll.addFirst("Python");
	//System.out.println(ll);
	//add at last index
	ll.addLast("HTML");
	//System.out.println(ll);
	String secondElement=ll.get(1);
	System.out.println(secondElement);
	ll.set(1, "Sel");
	System.out.println(ll.get(1));
	
	//remove first and last element
	ll.removeFirst();
	ll.removeLast();
	System.out.println(ll);
	
	System.out.println("************Using Iterator*********");
	Iterator<String> itr=ll.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
