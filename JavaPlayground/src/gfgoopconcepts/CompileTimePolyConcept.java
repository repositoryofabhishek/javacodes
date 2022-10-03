package gfgoopconcepts;

public class CompileTimePolyConcept { //also called as static polymorphism
	public static void main(String[] args) {
		Addition a=new Addition();
		a.setA(10);
		a.setB(12);
		a.sum();
		a.sum(11, 11);
		a.sum(12.5,12.5);
	}
}

class Addition {
	private int a, b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void sum() {
		System.out.println(getA() + getB());
	}

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void sum(double a, double b) {
		System.out.println(a + b);
	}
}
