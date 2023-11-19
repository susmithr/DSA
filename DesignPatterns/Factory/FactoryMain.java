package DesignPatterns.Factory;

public class FactoryMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        shapeFactory.getShape("CIRCLE");


    }
}
