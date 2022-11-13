package singletonpattern;


public class EagerInitialization {
    
    //We should creating a private constructor
    //So we couldn't make the objects outside of the class
    private EagerInitialization(){}
    
    //We can create only one object inside this class and it should be private static
    private static EagerInitialization instance = new EagerInitialization();
       
    //By usinng this static method we can access the object we already created in this class outside of the class
    public static EagerInitialization getInstance(){
        return instance;
    }
    
    
    
    //Example 01 - data implementation
    private final int age = 26;
    public int getAge(){
        return age;
    }
    
    //Example 02 - data implementation
    public void showSomeText(){
        System.out.println("Eager Initialization Accessed");
    }
    
}
