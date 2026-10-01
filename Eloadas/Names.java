import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("nevek.csv");
        List<String> nevek = new ArrayList<>();
         
        

        try (Scanner scanner = new Scanner(file, "UTF-8")) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");

                String nev = fields[0];
                nev = Character.toUpperCase(nev.charAt(0)) + nev.substring(1);
                nevek.add(nev);
            }
        }
        Collections.sort(nevek);
        for (String nev : nevek) {
            System.out.print(nev + " ");
        }
    }
}
