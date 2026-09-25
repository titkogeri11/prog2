public class Hamming {


    public static  int HammingCounter(String s1, String s2){
        int c = 0;

        if(s1.length() != s2.length()){
            return -1;
        }
        else{

            for(int i = 0; i < s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    c++;
                }
            }
            return c;


        }
    }

    public static void main(String[] args) {
        System.out.println("A megadott szavak Hamming-távolsága: " + HammingCounter("toned", "roses"));
    }
}
