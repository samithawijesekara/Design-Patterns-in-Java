package decorator.pattern;

public class Main {

    public static void main(String[] args) {
       
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("\nCircle of red border");
        redCircle.draw();

        Shape redRectangle = new BlueShapeDecorator(new Rectangle());
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
        
        Shape redTriangle = new BlueShapeDecorator(new RedShapeDecorator(new Triangle()));
        System.out.println("\nTriangle of red border");
        redTriangle.draw();

    }

}
