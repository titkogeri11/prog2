import java.util.Arrays;
import java.lang.Math;

public class Metodusok {
    
    static  void increasing_1(int a, int b, int c){
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    static void min_max_2(int a, int b, int c){
        int[] nums = {a, b, c};
        int min = nums[0];
        int max = nums[0];
        for(int i = 0; i < nums.length;i++){
            if (nums[i] < min) min = nums[i];
            if (Math.abs(nums[i]) > Math.abs(max)) max = nums[i];
            }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max + "(abs)");
        }
    static boolean is_valid_triangle_3(int a, int b, int c){
            return a + b > c && a + c > b && b + c > a;
        }
    static int leap_years_4(int y1, int y2){
            int n = 0;
            for(int i = y1; i <= y2;i++){
                if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                    n++;
                }
            }
            return n;
        }
    static int divide_5(int a, int b, int n){
            n = 0;
            do{
                n++;
                a -= b;
            }while(a >= b);
            return  n;
        }
    static boolean prime_number_6(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
    }
        return true;
}
    static void fibo_7(int n){  //7. feladat, B verzió

    int a = 1;
    int b = 0;

    for(int i = 1; i <= n;i++){
        System.out.print(b + " ");
        b = a + b;
        a = b - a;
    }
    System.out.println(" ");

}
    static void reversed_num_8(int n){

    int n2 = 0;
    do{
        n2 = (n2 * 10 + (n % 10));
        n /= 10;
    }while(n != 0);

    System.out.println(n2);
}
    static long fact_9(int n){

        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
    static void dividable_10(int n1,int n2, int k){
    System.out.print("Osztható:  ");
    for(int i = n1 + 1; i < n2;i++){
        if(i % k == 0){
            System.out.print(i + " ");
        }
    }
    System.out.println();

}
    static int fibonacci_11(int n) {
    int a = 0;
    int b = 1;

    while (b <= n) {
        int temp = a + b;
        a = b;
        b = temp;
    }

    return b;
}
    static void ezer_kob_12() {

    for (int i = 1; i < 1000; i++) {
        String s = String.valueOf(i);

        try {
            int n1 = s.charAt(0) - '0';
            int n2 = s.charAt(1) - '0';
            int n3 = s.charAt(2) - '0';

            if (n1*n1*n1 + n2*n2*n2 + n3*n3*n3 == i) {
                System.out.print(i + " ");
            }

        } catch (StringIndexOutOfBoundsException e) {
            // ha nincs, csak 1 szj. akk continue
        }
    }
    }
    public static void main(String[] args) {
        System.out.println("1. feladat");
        increasing_1(1, 5, 3);

        System.out.println("2. feladat");
        min_max_2(5, -25, 3);

        System.out.println("3. feladat");
        System.out.println("Háromszög: " + is_valid_triangle_3(1, 2, 4));

        System.out.println("4. feladat");
        System.out.println("Szökőévek a két évszám között: " + leap_years_4(1492, 2026));

        System.out.println("5. feladat");
        System.out.println(("Hányados: " + divide_5(20, 240,5)));

        System.out.println("6. feladat");
        System.out.println("Prímszám: " + prime_number_6(11));

        System.out.println("7. feladat");
        fibo_7(10);

        System.out.println("8. feladat");
        reversed_num_8(12345);

        System.out.println("9. feladat");
        System.out.println("Faktoriális: " + fact_9(5));

        System.out.println("10. feladat");
        dividable_10(1, 20, 3);

        System.out.println("11. feladat");
        System.out.println("Következő Fibonacci-szám: " + fibonacci_11(20));

        System.out.println("12. feladat");
        ezer_kob_12();
        System.out.println();
    }
}
