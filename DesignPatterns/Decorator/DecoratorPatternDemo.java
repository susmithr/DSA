package DesignPatterns.Decorator;

public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle=new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        redCircle.draw();
        redRectangle.draw();
    }
}
