    class Rectangle{
        double width;
        double height;

        Rectangle(double w, double h){
            if (w <= 0 || h <= 0){
                throw new RuntimeException("Введены неправильнык параметры фигуры");
            }
            width = w;
            height = h;
        }

        double S(){
            return width * height;
        }

        double P(){
            return 2 * (width + height);
        }
    }
    class Triangle{
        double gip;
        double kat1;
        double kat2;

        Triangle(double a, double b, double c){
            if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a){
                throw new RuntimeException("Введены неправильные параметыр фигуры");
            }
            gip = a;
            kat1 = b;
            kat2 = c;
        }

        double P(){
            return gip + kat1 + kat2;
        }

        double S(){
            double p = P() / 2;
            return Math.sqrt(p * (p - gip) * (p - kat1) * (p - kat2));
        }
    }
    class Circle{
        double radius;

        Circle(double r){
            if (r <= 0){
                throw new RuntimeException("Введены неправильнык параметры");
            }
            radius = r;
        }

        double S(){
            return 3.14 * radius * radius;
        }

        double P(){
            return 2 * 3.14 * radius;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Rectangle R = new Rectangle(4, 5);
            System.out.println("Rectangle area: " + R.S());
            System.out.println("Rectangle perimeter: " + R.P());
        }
    }