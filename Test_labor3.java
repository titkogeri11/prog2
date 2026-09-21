public class Test_labor3 {
    
    public static void main(String[] args) {
        
        Hallgato h1 = new Hallgato("Deb Ella", "QRT56", 3.7, 4);
        h1.koszon();
        h1.setNev("Bőrönd Ella");
        System.out.println(h1.getNev());
        h1.toString();

        Rectangle r1 = new Rectangle();
        System.out.println(r1.getPerimeter());

        QuadraticEquation eq1 = new QuadraticEquation(2, 5, 9);
        System.out.println("x1 = " + eq1.getRoot1());
        System.out.println("x2 = " + eq1.getRoot2());
        System.out.println(eq1);
    }

}
