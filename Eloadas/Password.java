import java.util.List;

public class Password {
    
    public static boolean StrongPassword(String s){
        int kb = 0;
        int nb = 0;
        int num = 0;
        int spec = 0; //. , : ;
        List<Character> specialisKarakterek = List.of('.', ',', ':', ';');

        for(int i = 0; i < s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                kb++;
            }
            else if(Character.isUpperCase(s.charAt(i))){
                nb++;
            }
            else if(Character.isDigit(s.charAt(i))){
                num++;
            }
            else if(specialisKarakterek.contains(s.charAt(i))){
                spec++;
            }

        }
        if(kb >= 1 && nb >= 1 && num >= 2 && spec >= 1) return true;
        return false;
    }


    public static void main(String[] args) {

        List<String> sorok = FileUtils.readLines("passwords.txt");
        int sum = 0;
        /* 
            for (int i = 0; i < sorok.size(); i++) {
                String sor = sorok.get(i);
                System.out.println(sor);
            }
                */

            for(int i = 0; i < sorok.size();i++){
                if(StrongPassword(sorok.get(i))) sum++;
            }
            System.out.println(sum);
    }

}
