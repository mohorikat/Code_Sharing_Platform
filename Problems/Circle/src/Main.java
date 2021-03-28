class Circle {
    Double radius;

    public Circle(Double radius) {

        this.radius = radius;
    }

    public Circle() {}

    public static void main(String[] args) {
        Circle circle = new Circle();
        try {
            System.out.println(circle.getLength() + " " + circle.getArea());
        } catch (NullPointerException e) {
            System.out.println("no radius provided");
        }
    }

    public double getLength() {
        Double length = this.radius;
        if (length != null) {
            length = 2 * radius * Math.PI;
        } else {
            length = 0.0;
        }
        return length;
    }

    public double getArea() {
        double area;
        if (radius != null) {
            area = radius * radius * Math.PI;
        } else {
            area = 0.0;

        }
        return area;
    }
}
