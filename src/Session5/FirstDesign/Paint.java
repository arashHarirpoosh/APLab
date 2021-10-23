package Session5.FirstDesign;

import java.util.ArrayList;

public class Paint {
    private ArrayList<Triangle> triangles;
    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;

    /**
     * Create paint object
     */
    public Paint() {
        this.triangles = new ArrayList<>();
        this.circles = new ArrayList<>();
        this.rectangles = new ArrayList<>();
    }

    /**
     * Add new triangle object to the triangles array list
     * @param t Triangle object
     */
    public void addTriangle(Triangle t){
        this.triangles.add(t);
    }

    /**
     * Add new circle object to the circles array list
     * @param c Circle object
     */
    public void addCircle(Circle c){
        this.circles.add(c);
    }

    /**
     * Add new rectangle object to the rectangles array list
     * @param r Rectangle object
     */
    public void addRectangle(Rectangle r){
        this.rectangles.add(r);
    }

    /**
     * Print all the shapes info
     */
    public void drawAll() {
        System.out.println("Rectangles:");
        for (Rectangle rect: this.rectangles) {
            rect.draw();
        }

        System.out.println("\nCircles:");
        for (Circle circle : this.circles) {
            circle.draw();
        }

        System.out.println("\nTriangles:");
        for (Triangle triangle : this.triangles) {
            triangle.draw();
        }
    }

    /**
     * Print all the objects info with toString method
     */
    public  void printAll(){
        System.out.println("Rectangles:");
        for (Rectangle rect: this.rectangles) {
            System.out.println(rect.toString());
        }

        System.out.println("\nCircles:");
        for (Circle circle : this.circles) {
            System.out.println(circle.toString());
        }

        System.out.println("\nTriangles:");
        for (Triangle triangle : this.triangles) {
            System.out.println(triangle.toString());
        }
    }
}
