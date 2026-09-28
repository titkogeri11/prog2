public class HammingV2 {

    private HammingV2(){
        //nem peldanyosithato
    }
/*
private String s1;
private String s2;
*/

    public static int distance(String s1,String s2){
        int d = 0;
        if(s1.length() != s2.length()){
            return -1;
        }
        else{
            for(int i = 0; i < s1.length();i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    d++;
                }
            }
            return d;
        }
    }
}
