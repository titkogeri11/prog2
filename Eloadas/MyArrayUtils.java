public class MyArrayUtils {

    public static void reverse(int[] tomb){
        for(int i = 0, j = tomb.length - 1; i < j; i++, j--){
            int temp = tomb[i];
            tomb[i] = tomb[j];
            tomb[j] = temp;
        }
    }

    public static void sortDescending(int[] tomb){
        for (int i = 0; i < tomb.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < tomb.length - i - 1; j++) {
                if (tomb[j] < tomb[j + 1]) {
                    int temp = tomb[j];
                    tomb[j] = tomb[j + 1];
                    tomb[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static boolean equals(int[] t1, int[] t2){
        if(t1.length != t2.length){
            return false;
        }
        for(int i = 0; i < t1.length; i++){
            if(t1[i] != t2[i]){
                return false;
            }
        }
        return true;
    }

    public static void fill(int[] t, int n){
        for(int i = 0;i < t.length;i++){
            t[i] = n;
        }
    }

    public static void sort(int[] tomb){
            for (int i = 0; i < tomb.length - 1; i++) {
                boolean swapped = false;
                for (int j = 0; j < tomb.length - i - 1; j++) {
                    if (tomb[j] > tomb[j + 1]) {
                        int temp = tomb[j];
                        tomb[j] = tomb[j + 1];
                        tomb[j + 1] = temp;
                        swapped = true;
                    }
                }
            if (!swapped)
                break;
        }
    }
}