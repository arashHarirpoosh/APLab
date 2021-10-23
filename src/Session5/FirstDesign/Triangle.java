package Session5.FirstDesign;

import java.util.ArrayList;
import java.util.Collections;

public class Triangle {
    private ArrayList<Double> sides = new ArrayList<>();

    /**
     * Create a Triangle object
     * @param a0 First side
     * @param a1 Second side
     * @param a2 Third side
     */
    public Triangle(double a0, double a1, double a2) {
        this.sides.add(a0);
        this.sides.add(a1);
        this.sides.add(a2);
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
    public boolean isEquilateral(){
        for (int i = 1; i < this.sides.size(); i++) {
            if (!this.sides.get(i - 1).equals(this.sides.get(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculate the perimeter of the triangle
     * @return The perimeter of the triangle
     */
    public double calculatePerimeter(){
        double p = 0;
        for (Double side : this.sides) {
            p += side;
        }
        return p;
    }

    /**
     * Calculate the Area of the triangle
     * @return The area of the triangle
     */
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
        if (this.isEquilateral()) {
            obj.append("Equilateral");
        }
        else {
            obj.append("Triangle");
        }
        for (Double side : this.sides) {
            obj.append(", ").append(String.valueOf(side));
        }
        return obj.toString();
    }


}
