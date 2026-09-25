public class Test_LE {

    public static void main(String[] args) {
        LinearEquation le1 = new LinearEquation(1, 2, 3, 4, 5, 6);
        LinearEquation le2 = new LinearEquation(2, 4, 6, 8, 10, 12);
        LinearEquation le3 = new LinearEquation(1, 3, 5, 7, 9, 13);

        double s1_1 = le1.getX();
        double s1_2 = le1.getY();
        double s2_1 = le2.getX();
        double s2_2 = le2.getY();
        double s3_1 = le3.getX();
        double s3_2 = le3.getY();

        if (!le1.isSolvable()) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.println("le1 x = " + s1_1 + ", y = " + s1_2);
        }

        if (!le2.isSolvable()) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.println("le2 x = " + s2_1 + ", y = " + s2_2);
        }

        if (!le3.isSolvable()) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.println("le3 x = " + s3_1 + ", y = " + s3_2);
        }
    }
}
