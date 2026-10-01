import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Movies {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("mozik.csv");

        try (Scanner scanner = new Scanner(file, "UTF-8")) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(";");

                double rating = Double.parseDouble(fields[0].replace(',', '.'));
                String title = fields[1];
                int votes = Integer.parseInt(fields[2]);

                if (votes > 500000) {
                    System.out.println(title + " - " + rating + " (" + votes + " szavazat)");
                }
            }
        }
    }
}
