public class Rectangle {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return width * length;
    }
    double getPerimeter() {
        return 2 * (width + length);
    }
}
