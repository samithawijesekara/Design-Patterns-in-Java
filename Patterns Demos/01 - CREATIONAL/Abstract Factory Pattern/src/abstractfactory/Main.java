package abstractfactory;


public class Main {

    public static void main(String[] args) {
        
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape01 = shapeFactory.getShape("SQUARE");
        shape01.draw();
        
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color01 = colorFactory.getColor("GREEN");
        color01.fill();
        
    }
    
}
