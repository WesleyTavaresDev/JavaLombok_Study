package shapearea;

public class Main {
    public static void main(String[] args) 
    {
        Triangle triangle = new Triangle();

        triangle.setHeight(23.0);
        triangle.setWidth(12.0);

        Rectangle rect = new Rectangle();

        rect.setWidth(30.0);
        rect.setHeight(15.0);

        System.out.println("Triangle area -> " + triangle.area());
        System.out.println("Rectangle ares -> " + rect.area());
    }
}
