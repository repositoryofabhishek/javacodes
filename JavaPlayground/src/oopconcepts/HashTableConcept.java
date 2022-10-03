package oopconcepts;

import java.util.Hashtable;

public class HashTableConcept {
public static void main(String[] args) {
	Hashtable h=new Hashtable<>();
	h.put('A', 1000);
	h.put('B', 2000);
	h.put('C', 3000);
	
	System.out.println(h.get('C'));
	
	Hashtable<Integer, String> ht=new Hashtable<>();
	ht.put(1, "Abhishek");
	ht.put(2, "Gojou");
	ht.put(3, "Nanami");
}
}
