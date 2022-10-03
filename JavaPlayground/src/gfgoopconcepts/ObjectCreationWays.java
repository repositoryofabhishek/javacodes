package gfgoopconcepts;

public class ObjectCreationWays {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException{
		ObjectCreationWays oo=new ObjectCreationWays(); // one way
		ObjectCreationWays of= (ObjectCreationWays)Class.forName("gfgoopconcepts.ObjectCreationWays").newInstance(); //second way
		ObjectCreationWays ot=(ObjectCreationWays)oo.clone(); //third way.
		
		oo.testingMethod();
		
		try
		{
		of.testingMethod();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		ot.testingMethod();
	}

	public void testingMethod()
	{
		System.out.println("This is the testing method for object instantiation");
	}
}
