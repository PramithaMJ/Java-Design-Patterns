package Open_Close_Principle.EX2;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    public double radius;

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    public double side;

    @Override
    double calculateArea() {
        return side * side;
    }
}
