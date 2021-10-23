package Session5.SecondDesign;

import java.util.ArrayList;

public class Paint {
    private ArrayList<Shape> shapes;

    /**
     * Create paint object
     */
    public Paint() {
        this.shapes = new ArrayList<>();
    }

    /**
     * Add new shape object to the triangles array list
     * @param s Shape object
     */
    public void addShape(Shape s){
        this.shapes.add(s);
    }


    /**
     * Print all the shapes info
     */
    public void drawAll() {
        for (Shape shape: this.shapes) {
            shape.draw();
            System.out.println();
        }
    }

    /**
     * Print all the objects info with toString method
     */
    public void printAll() {
        for (Shape shape: this.shapes) {
            System.out.println(shape.toString());
        }
    }

    /**
     * Print the Square Rectangle and Equilateral Triangle
     */
    public void describeEqualSides() {
        for (Shape shape: this.shapes) {
            if ((shape instanceof Rectangle && ((Rectangle) shape).isSquare())||
                    (shape instanceof Triangle && ((Triangle) shape).isEquilateral())) {
                System.out.println(shape.toString());
            }
        }
    }
}
