public class QuadraticEquation {
    
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double geta() {
        return a;
    }

    public void seta(double a) {
        this.a = a;
    }

    public double getb() {
        return b;
    }

    public void setb(double b) {
        this.b = b;
    }

    public double getc() {
        return c;
    }

    public void setc(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1(){
        if(this.getDiscriminant() < 0){
            return 0;
        }
        else{
            return ((-1)*this.b + Math.sqrt(this.getDiscriminant()))/ (2*this.a);
        }
    }

        public double getRoot2(){
        if(this.getDiscriminant() < 0){
            return 0;
        }
        else{
            return ((-1)*this.b - Math.sqrt(this.getDiscriminant()))/ (2*this.a);
        }
    }

        public String toString(){

            if(this.b > 0 && this.c > 0){
                return this.a + "x^2 -" + this.b + "x - " + this.c;
            }
            else{
                return this.a + "x^2" + this.b + "x" + this.c;
                }
    }

}
