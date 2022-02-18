package design.patterns.SOLID.liskov.rectangleexample;

public class Square extends Rectangle implements Shape {

    private int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int computeArea() {
        return side * side;
    }
}
