package decorator.pattern;

public class Main {

    public static void main(String[] args) {
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
        
        System.out.println("\n");
        
        Shape redRectangle = new BlueShapeDecorator(new Rectangle());
        redRectangle.draw();
    }

}
