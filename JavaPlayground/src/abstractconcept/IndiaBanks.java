package abstractconcept;

public abstract class IndiaBanks { // Abstraction means to hide some implementation logic.
	//there is no main method in abstract class
	// abstract can have both abstract as well as non-abstract method.
	// it achieves partial abstraction, as compared to interfaces which must have only abstraction methods. helping it in reaching 100% abstraction.
	// In abstract, we can have final, static and non static variables whereas in interface, we can have only static and final variables.

	
	public abstract void loanPercentage();
	public void debit()
	{
		System.out.println("India Banks-- Debit method.");
	}
	public void credit()
	{
		System.out.println("India Banks-- Credit method.");
	}
	
}
