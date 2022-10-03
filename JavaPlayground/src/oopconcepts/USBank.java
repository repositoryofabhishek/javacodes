package oopconcepts;

public interface USBank {

	int min_Bal=100; // this value is final in nature and cannot be changed at any point now
	public void credit(); // only declaration happens in interfaces
	public void debit();
	public void transferMoney();
	
	//no method body and only method prototype
	//all the variables declared in interface are static in nature by default. no need to write static in front of them
	// no static methods are allowed in interface
	//there is no main method in the interface.
	//we cannot create objects on interfaces, they are abstract in nature.
}
