
class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}


class Circle {
    double radius;

    Circle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.radius = radius;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}


class Triangle {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;


        if (a <= 0 || b <= 0 || c <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
    }

    double getArea() {
        // Формула Герона (самая простая для треугольника)
        double p = getPerimeter() / 2; // полупериметр
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    double getPerimeter() {
        return a + b + c;
    }
}


class TestFigures {
    public static void main(String[] args) {
        try {
            Rectangle rect = new Rectangle(5, 10);
            System.out.println("Прямоугольник площадь: " + rect.getArea());
            System.out.println("Прямоугольник периметр: " + rect.getPerimeter());

            Circle circle = new Circle(7);
            System.out.println("Круг площадь: " + circle.getArea());
            System.out.println("Круг периметр: " + circle.getPerimeter());

            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println("Треугольник площадь: " + triangle.getArea());
            System.out.println("Треугольник периметр: " + triangle.getPerimeter());


            Triangle badTriangle = new Triangle(1, 2, 10);
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}