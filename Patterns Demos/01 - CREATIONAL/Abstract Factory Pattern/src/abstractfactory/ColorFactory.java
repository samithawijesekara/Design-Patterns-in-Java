package abstractfactory;


public class ColorFactory extends AbstractFactory {
    
    @Override
    Shape getShape(String shapeType) {
        return null;
    }
    
    @Override
    public Color getColor(String shapeColor) {
        if(shapeColor == null){
            return null;
        }else if(shapeColor == "RED"){
            return new Red();
        }else if(shapeColor == "GREEN"){
            return new Green();
        }else if(shapeColor == "BLUE"){
            return new Blue();
        }
        return null;
    }
            
}
