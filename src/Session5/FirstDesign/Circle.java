package Session5.FirstDesign;

public class Circle {
    double radius;

    /**
     * Create circle object
     * @param radius The radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return The radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculate the perimeter of the circle
     * @return The perimeter of the circle
     */
    public double calculatePerimeter(){
        return 2 * Math.PI * this.radius;
    }

    /**
     * Calculate the Area of the circle
     * @return The area of the circle
     */
    public double calculateArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Print the kind, perimeter and area of the shape
     */
    public void draw() {
        System.out.println("Shape: circle");
        System.out.println("Shape Perimeter: " + String.valueOf(this.calculatePerimeter()));
        System.out.println("Shape Area: " + String.valueOf(this.calculateArea()));
    }

    /**
     * Check the equality of two object
     * @param obj The given object
     * @return The equality of the object
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     *
     * @return The string contains shape info
     */
    @Override
    public String toString() {
        return "Circle" +
                ", " + String.valueOf(this.radius);
    }
}
