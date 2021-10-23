package Session5.FirstDesign;

import java.util.ArrayList;
import java.util.Collections;

public class Rectangle {
    private ArrayList<Double> sides = new ArrayList<>();

    /**
     * Create a Rectangle object
     * @param a0 First side
     * @param a1 Second side
     * @param a2 Third side
     * @param a3 Fourth side
     */
    public Rectangle(double a0, double a1, double a2, double a3) {
        this.sides.add(a0);
        this.sides.add(a1);
        this.sides.add(a2);
        this.sides.add(a3);
    }

    /**
     *
     * @return The array list which contains the rectangle sides
     */
    public ArrayList<Double> getSides() {
        return sides;
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
     * Calculate the perimeter of the rectangle
     * @return The perimeter of the rectangle
     */
    public double calculatePerimeter(){
        double p = 0;
        for (Double side : this.sides) {
            p += side;
        }
        return p;
    }

    /**
     * Calculate the Area of the rectangle
     * @return The area of the rectangle
     */
    public double calculateArea(){
        if (this.isSquare()) {
            return Math.pow(this.sides.get(0) , 2);
        }

        return Collections.max(this.sides) * Collections.min(this.sides);
    }

    /**
     * Print the kind, perimeter and area of the shape
     */
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
        StringBuilder obj = new StringBuilder();
        if (this.isSquare()) {
            obj.append("Square");
        }
        else {
            obj.append("Rectangle");
        }
        for (Double side : this.sides) {
            obj.append(", ").append(String.valueOf(side));
        }
        return obj.toString();
    }
}
