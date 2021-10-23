package Session5.SecondDesign;

import java.util.Collections;

public class Rectangle extends Polygon {
    public Rectangle(Double... args) {
        super(args);
    }

    /**
     *
     * @return Whether the rectangle is square or not
     */
    public boolean isSquare(){
        for (int i = 1; i < this.sides.size(); i++) {
            if (!this.sides.get(i - 1).equals(this.sides.get(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculate the Area of the rectangle
     * @return The area of the rectangle
     */
    @Override
    public double calculateArea(){
        if (this.isSquare()) {
            return Math.pow(this.sides.get(0) , 2);
        }

        return Collections.max(this.sides) * Collections.min(this.sides);
    }

    /**
     * Print the kind, perimeter and area of the shape
     */
    @Override
    public void draw() {
        if (this.isSquare()) {
            System.out.println("Shape: Square");
        }
        else {
            System.out.println("Shape: Rectangle");
        }
        System.out.println("Shape Perimeter: " + String.valueOf(this.calculatePerimeter()));
        System.out.println("Shape Area: " + String.valueOf(this.calculateArea()));
    }
}
