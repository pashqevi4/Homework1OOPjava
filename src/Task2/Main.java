package Task2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Высота прямоугольника: " + rectangle.getHeight());
        System.out.println("Ширина прямоугольника: " + rectangle.getWidth());
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());
        rectangle.setHeight(50);
        rectangle.setWidth(40);
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());
    }
}
