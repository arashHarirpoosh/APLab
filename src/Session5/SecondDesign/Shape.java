package Session5.SecondDesign;

public interface Shape {

    /**
     * Calculate the perimeter of the shape
     * @return The perimeter of the shape
     */
    public double calculatePerimeter();

    /**
     * Calculate the Area of the shape
     * @return The area of the shape
     */
    public double calculateArea();

    /**
     * Print the kind, perimeter and area of the shape
     */
    public void draw();

    /**
     * Check the equality of two object
     * @param obj The given object
     * @return The equality of the object
     */
    @Override
    public boolean equals(Object obj);

    /**
     *
     * @return The string contains shape info
     */
    @Override
    public String toString();
}
