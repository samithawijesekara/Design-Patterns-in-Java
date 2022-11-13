package singletonpattern;


public class Main {


    public static void main(String[] args) {
        
        //We couldn't call the constructor because of the constructor is private
        // SingleObject obj = new SingleObject();
        
        //To access the object we need to call the getInstance() static method in the SingleObject class
        //We can call to getInstance() like this because of it's a static method
        
        
        EagerInitialization objEager = EagerInitialization.getInstance();
        //Access the data in singleton pattern class
        System.out.println(objEager.getAge());
        objEager.showSomeText();
        
        
        LazyInitialization objLazy = LazyInitialization.getInstance();
        //Access the data in singleton pattern class
        System.out.println(objLazy.getAge());
        objLazy.showSomeText();
        
        
    }
    
}
