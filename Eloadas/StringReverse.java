public class StringReverse {

public static String reverse(String szoveg) {
    String eredmeny = "";

    for (int i = 0; i < szoveg.length(); i++) {
        char karakter = szoveg.charAt(i);

        if (Character.isLowerCase(karakter)) {
            eredmeny += Character.toUpperCase(karakter);
        } else if (Character.isUpperCase(karakter)) {
            eredmeny += Character.toLowerCase(karakter);
        } else {
            eredmeny += karakter;
        }
    }

    return eredmeny;
}

    public static void main(String[] args) {
        

        //System.out.println("Első argumentum: " + args[0]);
        //System.out.println(args.length);
        System.out.println(reverse(args[0]));
    }
    
}
