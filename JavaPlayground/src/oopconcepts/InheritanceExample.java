package oopconcepts;

public class InheritanceExample {
    public static void main(String[] args) {
        BMW obj=new BMW(); //compile time polymorphism
        obj.start();
        obj.stop();
        obj.theftSafety();
        obj.refuel();
        System.out.println("*********");
        Car c1=new BMW(); // Dynamic polymorphism. child class object can be referred by parent class reference variable
        //this is also called top casting
        c1.start();
        c1.stop();
        c1.refuel();
        //c1.theft method because this object is being referred by parent, car class ref var cannot take properties of child class
       // BMW b1=new Car(); this is called down casting, and it is not possible in java
    }

}
