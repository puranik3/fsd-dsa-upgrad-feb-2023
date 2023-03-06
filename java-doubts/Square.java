package doubtsclearingfeb;
public class Square extends Shape {
    private int side;

    public Square( int side ) {
        this.side = side;
    }

    public double calculateArea() {
        return this.side * this.side;
    }
}