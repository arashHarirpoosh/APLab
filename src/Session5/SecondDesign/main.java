package Session5.SecondDesign;


public class main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);

        Polygon rect1 = new Rectangle(1.0,4.0,1.0,4.0);
        Polygon rect2 = new Rectangle(8.0, 5.0, 8.0, 5.0);
        Polygon rect3 = new Rectangle(6.0, 6.0, 6.0, 6.0);

        Polygon tri1 = new Triangle(2.0, 2.0, 2.0);
        Polygon tri2 = new Triangle(4.0, 4.0, 6.0);

        Paint paint = new Paint();

        paint.addShape(circle1);
        paint.addShape(circle2);

        paint.addShape(rect1);
        paint.addShape(rect2);
        paint.addShape(rect3);

        paint.addShape(tri1);
        paint.addShape(tri2);

        paint.drawAll();
        System.out.println("-----------------");
        paint.printAll();
        System.out.println("-----------------");
        paint.describeEqualSides();

    }
}
