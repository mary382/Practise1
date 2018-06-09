public class Rectangle {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double squareOfRectangle() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle's parameters: " + a + ", " + b + ".";
    }
}
