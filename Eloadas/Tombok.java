import java.util.Arrays;

public class Tombok {

    public static void main(String[] args) {
        //int[] scores = new int[5]; //0 0 0 0 0
        int[] scores = {1, 2, 3, 4, 5};


        for(int i = 0; i < scores.length;i++){
            System.out.println(scores[i]);
        }

        System.out.println(Arrays.toString(scores));

        int[] five = getOneToFive(); //[1,2,3,4,5]
        System.out.println(Arrays.toString(five));

        MyUtils.reverse(scores);

    } //main





    static int[] getOneToFive(){
        int[] result = {1, 2, 3, 4, 5};
        return result;
    }
}
