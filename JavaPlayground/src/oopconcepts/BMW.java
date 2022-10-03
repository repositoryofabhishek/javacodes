package oopconcepts;

public class BMW extends Car{ // extends is called has a relationship
    // when same method is present in parent class as well as in child class with same name and same number of args, that concept is called method-overriding
    public void start() //overridden method
    {
        System.out.println("BMW start method");
    }
    public void theftSafety()
    {
        System.out.println("BMW theft safety method");
    }
}
