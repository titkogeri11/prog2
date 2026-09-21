public class Rectangle {
    public double width;  //attributomok
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
}
    public Rectangle(){
        this.width = 1;
        this.height = 1;
}

    public double getArea(){
        return this.height * this.width;  //metodusok
    }

    public double getPerimeter(){
        return 2*(this.width + this.height);
    }


}
