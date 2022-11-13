package singletonpattern;


public class ThreadSafeInitialization {
    
    private ThreadSafeInitialization(){}
    
    //In this singleton way we do not creating the object very first time at the memory
    private static ThreadSafeInitialization instance;
    
    public static ThreadSafeInitialization getInstancce(){
        if(instance == null){
            synchronized (ThreadSafeInitialization.class){
                if(instance == null){
                    instance = new ThreadSafeInitialization(); 
                }
            }
        }
        return instance;
    }
    
    
    
}
