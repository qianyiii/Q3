import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        File data = new File("data.txt");

        int index = 0;
        ArrayList<SalesData> salesData = new ArrayList<>();

        if (data.exists()) {
            System.out.println("File exists");
            try (Scanner reader = new Scanner(data)){
                while (reader.hasNext()){
                    String line = reader.nextLine();
                    if (index > 0) {
                        String[] items = line.split(",");
                        String name = items[1];
                        double total = Double.parseDouble(items[2]);
                        int quantity = Integer.parseInt(items[3]);

                        SalesData datas = new SalesData(name, total, quantity);

                        System.out.print(index + ". ");
                        System.out.println(datas);
                        System.out.println();
                    }
                    index++;
                }

            } catch (FileNotFoundException exception) {
                System.out.println(exception.getMessage());
            }

        } else {
            System.out.println("File does not exists");
        }
    }
}