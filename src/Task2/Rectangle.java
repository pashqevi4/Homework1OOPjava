package Task2;

import com.sun.nio.sctp.SctpSocketOption;

public class Rectangle {

//    Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). Класс должен обладать следующими методами:
//    Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
//    Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
//    Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
//    Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
//    Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).

    public int width;
    public int height;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
        height = 5;
        width = 3;
    }

    public int getHeight(){
       return height;
    }

    public int getWidth(){
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea() {
        return height * width;
    }

    public int calculatePerimeter() {
        return 2 * (height + width);
    }

}
