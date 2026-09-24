public class Main {

    static void main(String[] args) {

        Pont p1 = new Pont();
        Pont p2 = new Pont();
        Pont p3 = new Pont();
        Pont p4 = new Pont();

        double p1yOriginal = p1.getY();
        double p2yOriginal = p2.getY();
        double p3xOriginal = p3.getX();
        double p4xOriginal = p4.getX();

        System.out.println("Régi pontok:");
        System.out.println("p1: (x=" + p1.getX() + ", y=" + p1yOriginal + ")");
        System.out.println("p2: (x=" + p2.getX() + ", y=" + p2yOriginal + ")");
        System.out.println("p3: (x=" + p3xOriginal + ", y=" + p3.getY() + ")");
        System.out.println("p4: (x=" + p4xOriginal + ", y=" + p4.getY() + ")");

        p1.setY(p1yOriginal + 5);
        p2.setY(p2yOriginal + 5);
        p3.setX(p3xOriginal - 3.4);
        p4.setX(p4xOriginal - 3.4);

        System.out.println("\nÚj pontok:");
        System.out.println("p1: (x=" + p1.getX() + ", y=" + p1.getY() + ")");
        System.out.println("p2: (x=" + p2.getX() + ", y=" + p2.getY() + ")");
        System.out.println("p3: (x=" + p3.getX() + ", y=" + p3.getY() + ")");
        System.out.println("p4: (x=" + p4.getX() + ", y=" + p4.getY() + ")");
    }

}
