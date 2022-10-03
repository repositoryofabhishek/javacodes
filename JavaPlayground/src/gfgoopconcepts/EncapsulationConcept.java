package gfgoopconcepts;

public class EncapsulationConcept {
	public static void main(String[] args) {
		Area a=new Area();
		a.setLength(12);
		a.setBreadth(12);
		a.getArea();
		Area b= new Area();
		b.setLength(13);
		b.setBreadth(13);
		b.getArea();
	}
	

}

class Area
{
	 private int length;
	 private int breadth;
	 
	 
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public void getArea()
	{
		int area= getLength()*getBreadth();
		System.out.println(area);
	}
}
