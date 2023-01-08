
class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.width = width;
//    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}


