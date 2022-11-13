package abstractfactory;


public class FactoryProducer {
    
    public static AbstractFactory getFactory(String choice){
        if(choice == "SHAPE"){
            return new ShapeFactory();
        }else if(choice == "COLOR"){
            return new ColorFactory();
        }
        return null;
    }
    
}
