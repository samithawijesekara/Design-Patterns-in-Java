package facade.pattern;

public class Main {


    public static void main(String[] args) {
        FacadeShapeMaker facadeShapeMaker = new FacadeShapeMaker();
        facadeShapeMaker.drawCircle();
        facadeShapeMaker.drawRectangle();
        facadeShapeMaker.drawSquare();
    }
    
}
