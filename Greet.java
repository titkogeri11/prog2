
import java.util.Scanner;

class Greet {

    static  boolean adult(int n){

        if(n > 18){
            return  true;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Add meg a neved: ");
        String nev = myObj.nextLine();

        System.out.println("Kor: ");
        int age = myObj.nextInt();
        boolean legal = adult(age);
        System.out.println("Hello, " + nev + "!");

        if(legal){
            System.out.println("Szavazhatsz.");
        }

        myObj.close();
    }
}
