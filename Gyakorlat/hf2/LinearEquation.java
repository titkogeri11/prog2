public class LinearEquation {

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    private double x;
    private double y;

    public LinearEquation(double a, double b, double d, double c, double e, double f) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getD() {
        return d;
    }
    public double getE() {
        return e;
    }
    public double getF() {
        return f;
    }
    public boolean isSolvable(){
        return (a*d - b*c != 0);
    }

    public double getX(){
        return x = (e*d - b*f)/(a*d - b*c);
    }

    public double getY(){
        return y = (a*f - e*c)/(a*d - b*c);
    }


}