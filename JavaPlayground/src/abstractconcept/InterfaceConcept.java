package abstractconcept;

public interface InterfaceConcept {
	final int a=10;
	public void display();
	

}

class Testing implements InterfaceConcept
{
	public void display()
	{
		System.out.println("This method is the implementation of interface's method");
	}
	
	public static void main(String[] args) {
		Testing t=new Testing();
		t.display();
	}
}
