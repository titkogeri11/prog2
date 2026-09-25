import static java.lang.Math.atan;
import static java.lang.Math.pow;

public class RegularPolygon {

    private int n = 3;
    private double side = 1;
    private double x;
    private double y;

    public RegularPolygon(){
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side){
        this.x = 0;
        this.y = 0;

        this.n = 6;
        this.side = 6;
    }

    public RegularPolygon(int n, double side, double x, double y){
        this.x = 3;
        this.y = 3;

        this.n = 3;
        this.side = 3;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter(){
        return this.n * this.side;
    }

    public double getArea(){
        return (0.25*pow(this.n, 2)*atan(180.0/this.n));
    }

    @Override
    public String toString() {
        return "RegularPolygon{" +
                "n=" + n +
                ", side=" + side +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
