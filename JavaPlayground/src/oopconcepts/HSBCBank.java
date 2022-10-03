package oopconcepts;

public class HSBCBank implements USBank, IndianBank { // this is mutliple inheritance concept, implementing two classes at once.
	// all the methods of the interface USBank needs to be overrided here in this class

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("HSBC credit method");
		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("HSBC debit method");
		
	}

	@Override
	public void transferMoney() {
		// TODO Auto-generated method stub
		System.out.println("HSBC transfer money method.");
		
	}

	public void educationLoan()
	{
		System.out.println("Education loan method.");
	}

	@Override
	public void carLoan() {
		// TODO Auto-generated method stub
		System.out.println("car Loan method");
		
	}

	@Override
	public void propertyLoan() {
		// TODO Auto-generated method stub
		System.out.println("property Loan method.");
		
	}
}
