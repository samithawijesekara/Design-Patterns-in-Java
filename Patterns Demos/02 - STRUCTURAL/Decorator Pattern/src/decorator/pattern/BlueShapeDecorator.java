package decorator.pattern;


public class BlueShapeDecorator extends ShapeDecorator{

    public BlueShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    
    @Override
    public void draw() {
        decoratedShape.draw();	       
        setBlueFill(decoratedShape);
    }

    private void setBlueFill(Shape decoratedShape){
        System.out.println("Fill Color: Blue");
    }
    
}
