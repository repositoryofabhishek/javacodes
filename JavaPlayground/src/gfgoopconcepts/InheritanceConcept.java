package gfgoopconcepts;

public class InheritanceConcept {
	public static void main(String[] args) {
		MountainBike b=new MountainBike(4, 5, 2);
		System.out.println(b.toString());
		b.nameOftheBike("Nimbus 2000");
	}
}

class Bicycle {
	public int gear;
	public int speed;

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

	public Bicycle(int gear, int speed) {
		this.speed = speed;
		this.gear = gear;
	}
}

class MountainBike extends Bicycle {
	public MountainBike(int gear, int speed, int height)
	{
		super(gear, speed);
		this.seatHeight=height;
	}

	public int seatHeight;

	public String toString()
	{
		return "Gears in this MountainBike are "+this.gear+", speed is "+this.speed+
					"and Seat height is "+this.seatHeight;
	}
	public void nameOftheBike(String name)
	{
		System.out.println("Name of this bike "+ name );
	}

}