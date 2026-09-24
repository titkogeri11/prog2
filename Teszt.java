public class Teszt {

    public static void main(String[] args) {

        RegularPolygon o1 = new RegularPolygon();
        RegularPolygon o2 = new RegularPolygon(6, 4);
        RegularPolygon o3 = new RegularPolygon(10, 4, 5.6, 7.8);

        double t1 = o1.getArea();
        double t2 = o2.getArea();
        double t3 = o3.getArea();

        double k1 = o1.getPerimeter();
        double k2 = o2.getPerimeter();
        double k3 = o3.getPerimeter();

        System.out.printf("o1 kerülete: %.3f, területe: %.3f%n", k1, t1);
        System.out.printf("o2 kerülete: %.3f, területe: %.3f%n", k2, t2);
        System.out.printf("o3 kerülete: %.3f, területe: %.3f%n", k3, t3);
    }
}