public class Rectangle {
    public double width = 1;  //attributomok
    public double height = 1;

    public Rectangle() {
        this.width = width;
        this.height = height;
}
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
}

    public double getArea(){
        return this.height * this.width;  //metodusok
    }

    public double getPerimeter(){
        return 2*(this.width + this.height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
