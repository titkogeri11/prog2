public class MyUtils {

    private MyUtils(){
        //nem peldanyosithato
    }

    public final static double PI = 3.14159;

    public static int duplaz(int n){
        return 2 * n;
    }

    public static int strlen(String s){
        return s.length();
    }

    public static void reverse(int[] tomb){
        for(int bal = 0, jobb = tomb.length - 1; bal < jobb; bal++, jobb--){
            int ideiglenes = tomb[bal];
            tomb[bal] = tomb[jobb];
            tomb[jobb] = ideiglenes;
        }
    }
}
