public class Main {
    public static void main(String[] args) {
//        new Rectangle("q", 1, 2, 3, 4);
        System.out.println(new Rectangle("q", 1, 2, 3, 4).toString());
    }
}
class Shape {
    String type;
    Integer r;
    Integer a, b, c, d;
    Shape(String type, Integer r, Integer a, Integer b, Integer c, Integer d) {
        this.type = type;
        this.r = r;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Shape(String type, Integer a, Integer b, Integer c, Integer d) {
        this.type = type;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    public String toString() {
        return "Type "+ type + getType().toString() + " " + getArea() + " " + getPerimeter();
    }

    public String getType() {
        return type;
    }
    public double getArea() {
        return 0.0;
    }
    public double getPerimeter() {
        return 0;
    };

}
class Circle extends Shape {
    Circle(String type, Integer r, Integer a, Integer b, Integer c, Integer d){
        super(type, r, a, b, c, d);
    }
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }
    public double getPerimetr() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
class Square extends Shape {

    Square(String type, Integer a, Integer b, Integer c, Integer d) {

        super(type, a, b, c, d);
    }
    public double getPerimeter() {
        return a + b + c + d;
    }
    public double getArea() {
        return a * a;
    }

}
class Rectangle extends Shape{
    public Rectangle(String type, Integer a, Integer b, Integer c, Integer d) {
        super(type, a, b, c, d);
    }
    public double getPerimeter() {
        return a * b;
    }
    public double getArea() {
        return (a + b + c + d);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
