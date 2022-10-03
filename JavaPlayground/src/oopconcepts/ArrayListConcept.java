package oopconcepts;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		//System.out.println(ar.size());
		ar.add(50);
		ar.add(60);
		ar.add("Hello");
		ar.add('L');
		ar.add(20.22);
		//System.out.println(ar.size());
	//	System.out.println(ar.get(2));
		ar.remove(9);
		for(int i=0;i<ar.size();i++)
		{
			System.out.print(ar.get(i)+" ");
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>(); // this is specifically for integers only.
			ar1.add(200);
			ar1.add(300);
			ar1.add(400);
			for(int i=0;i<ar1.size();i++)
			{
				System.out.println(ar1.get(i));
			}
	}
}
