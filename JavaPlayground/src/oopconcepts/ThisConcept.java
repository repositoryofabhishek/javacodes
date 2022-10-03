package oopconcepts;

public class ThisConcept {

	String name;
	int age;
	String dept;
	
	public ThisConcept(String name, int age, String dept)
	{
		this.name=name;
		this.age=age;
		this.dept=dept;
		
	}
	
	public void salaryCalculation(int basicPayrate)
	{
		double salary= (basicPayrate*8)*10;
		System.out.println("Salary of "+ this.name +" is "+salary);
	}
	
	
	public static void main(String[] args) {
		ThisConcept emp1=new ThisConcept("Ronnie",26,"Accountant");
		ThisConcept emp2=new ThisConcept("Honi", 27, "IT");
		
		emp1.salaryCalculation(20);
		emp2.salaryCalculation(22);


	}
}
