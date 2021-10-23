package Session5.SecondDesign;

public class Triangle extends Polygon {
    public Triangle(Double... args) {
        super(args);
    }

    /**
     *
     * @return Whether the rectangle is square or not
     */
    public boolean isEquilateral(){
        for (int i = 1; i < this.sides.size(); i++) {
            if (!this.sides.get(i - 1).equals(this.sides.get(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculate the Area of the triangle
     * @return The area of the triangle
     */
    @Override
    public double calculateArea(){
        double p = this.calculatePerimeter() / 2;
        double area_2 = p;
        for (Double side : this.sides) {
            area_2 *= (p - side);
        }
        return Math.sqrt(area_2);
    }

    /**
     * Print the kind, perimeter and area of the shape
     */
    @Override
    public void draw() {
        if (this.isEquilateral()) {
            System.out.println("Shape: Equilateral");
        }
        else {
            System.out.println("Shape: Triangle");
        }
        System.out.println("Shape Perimeter: " + String.valueOf(this.calculatePerimeter()));
        System.out.println("Shape Area: " + String.valueOf(this.calculateArea()));
    }
}
