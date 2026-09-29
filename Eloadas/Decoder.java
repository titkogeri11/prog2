public class Decoder {


    public static void decode(String s){
        StringBuilder decoded = new StringBuilder(s.length());
        for(int i = 0; i < s.length(); i++){
            char karakter = s.charAt(i);
            switch (karakter) {
                case '0': decoded.append('O'); break;
                case '1': decoded.append('I'); break;
                case '3': decoded.append('E'); break;
                case '4': decoded.append('A'); break;
                case '5': decoded.append('S'); break;
                case '7': decoded.append('T'); break;
                default: decoded.append(karakter); break;
            }
        }
        System.out.println(decoded);
    }
    
}
