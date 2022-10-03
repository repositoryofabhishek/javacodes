package oopconcepts;

public class TesterClass {
	public static void main(String[] args) {
		HSBCBank hsb=new HSBCBank();
		hsb.credit();
		hsb.debit();
		hsb.educationLoan();
		hsb.transferMoney();
		System.out.println("*************");
		
		//dynamic poly- child class object can be referred by parent interface class reference var.
		USBank h=new HSBCBank();
		//now we can only access only methods are similar to that of parent class, only overridden
		h.debit();
		h.credit();
		h.transferMoney();
	
		System.out.println(USBank.min_Bal);
	}
}
