public class Triangle extends ShapeClass {
    private double side1;
    private double side2;
    private double side3;

    Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide3() {
        return side3;
    }

    public double getP() {
        return (this.side1 + this.side2 + this.side3) / 2;
    }

    ;

    public double getHeight() {
        return 2 * (Math.sqrt(this.getP() * (this.getP() - this.side1) * (this.getP() - this.side1) * (this.getP() - this.side1))) / this.side1;
    }

    public double getArea() {
        return getHeight() * this.side3;
    }

    public double getPerimeter() {
        return getP() * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with side a = "
                + this.side1 + "side b = " + this.side2 + " side c = " + " side c = " + this.side3
                + " and " +
                " Area = " + this.getArea() + " Perimeter = " + this.getPerimeter();
    }
}