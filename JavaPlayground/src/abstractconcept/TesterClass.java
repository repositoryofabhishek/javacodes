package abstractconcept;

public class TesterClass {
	public static void main(String[] args) {
		
		IciciBank icb=new IciciBank();
		icb.carLoan();
		icb.credit();
		icb.debit();
		
		IndiaBanks idb=new IciciBank(); // Dynamic dispatch. Object created by reference of parent class. we cannnot call methods that specifically belongs to child class
	//idb.carLoan(); cannot be called by this object, other all methods can be called.
		idb.debit();
		idb.credit();
	}
}
