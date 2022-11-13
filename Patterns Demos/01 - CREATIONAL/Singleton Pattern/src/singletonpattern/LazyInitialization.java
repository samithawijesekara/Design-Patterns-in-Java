package singletonpattern;


public class LazyInitialization {
    
    private LazyInitialization(){}
    
    //In this singleton way we do not creating the object very first time at the memory
    private static LazyInitialization instance;
    
    public static LazyInitialization getInstance(){
        //We create the object when call the getInstance() method only. 
        if(instance == null){
            instance = new LazyInitialization();
        }
        //If the object is already created return that object again. In here do not creating two seperate objects. All the objects are same.
        return instance;
    }
    
    
    
    //Example 01 - data implementation
    private final int age = 26;
    public int getAge(){
        return age;
    }
    
    //Example 02 - data implementation
    public void showSomeText(){
        System.out.println("Lazy Initialization Accessed");
    }
    
}
