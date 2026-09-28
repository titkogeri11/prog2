public class Test {
    
    public static void main(String[] args) {
        int diff = HammingV2.distance("toned", "roses");
        System.out.println(diff);

        int[] tomb = {1, 2, 3, 4, 5};
        int[] tomb2 = {10, 8, 3, 2, 7};
/*
        MyArrayUtils.sortDescending(tomb);
        for(int i = 0;i < tomb.length;i++){
            System.out.print(tomb[i]);
        }
*/

        MyArrayUtils.sort(tomb2);
        for(int i = 0;i < tomb2.length;i++){
            System.out.print(tomb2[i] + " ");
        }

    }
    
}
