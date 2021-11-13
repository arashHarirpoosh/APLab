package Session6.part1;

public class Movie {
    private int name;
    private int prodyear;

    public Movie(int name, int prodyear) {
        this.name = name;
        this.prodyear = prodyear;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getProdyear() {
        return prodyear;
    }

    public void setProdyear(int prodyear) {
        this.prodyear = prodyear;
    }
}
