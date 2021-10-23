package Session5.SecondDesign;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Polygon implements Shape {
    protected ArrayList<Double> sides = new ArrayList<>();

    public Polygon(Double... args) {
        this.sides.addAll(Arrays.asList(args));
    }

    /**
     *
     * @return The sides of  the polygon
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    public double calculatePerimeter() {
        double p = 0;
        for (Double side : this.sides) {
            p += side;
        }
        return p;
    }

    @Override
    public String toString () {
        StringBuilder obj = new StringBuilder();
        if (this.sides.size() == 3) {
            obj.append("Triangle:: ");
        }
        else if (this.sides.size() == 4){
            obj.append("Rectangle:: ");
        }
        for (int i = 0; i < this.sides.size(); i++) {
            obj.append("side").append(String.valueOf(i + 1)).append(":").append(String.valueOf(this.sides.get(i))).append(", ");
        }
        return obj.toString();
    }
}
