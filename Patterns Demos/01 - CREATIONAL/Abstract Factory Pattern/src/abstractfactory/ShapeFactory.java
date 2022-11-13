package abstractfactory;


public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }else if(shapeType == "RECTANGLE"){
            return new Rectangle();
        }else if(shapeType == "SQUARE"){
            return new Square();
        }else if(shapeType == "CIRCLE"){
            return new Circle();
        }
        return null;
    }

    @Override
    Color getColor(String shapeColor) {
        return null;
    }
       
    
}
