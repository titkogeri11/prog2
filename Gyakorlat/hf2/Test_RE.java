public class Test_RE {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.printf("R1: width=%s, height=%s, area=%.2f, perimeter=%.2f%n",
                r1.width, r1.height, r1.getArea(), r1.getPerimeter());
        System.out.printf("R2: width=%s, height=%s, area=%.2f, perimeter=%.2f%n",
                r2.width, r2.height, r2.getArea(), r2.getPerimeter());
    }
}
