import java.util.Scanner;

class Calc {

    static float addition(float a, float b) {
        return a + b;
    }

    static float subtraction(float a, float b) {
        return a - b;
    }

    static float multiplication(float a, float b) {
        return a * b;
    }

    static float division(float a, float b) {
        if (b == 0) {
            System.out.println("Hiba: Nullával nem lehet osztani!");
            return 0;
        }
        return a / b;
    }

    static float modulo(float a, float b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("num A: ");
        float numA = myObj.nextFloat();

        System.out.print("num B: ");
        float numB = myObj.nextFloat();

        System.out.println("Összeg: " + addition(numA, numB));
        System.out.println("Különbség: " + subtraction(numA, numB));
        System.out.println("Szorzat: " + multiplication(numA, numB));
        System.out.println("Hányados: " + division(numA, numB));
        System.out.println("Maradék: " + modulo(numA, numB));

        myObj.close();
    }
}