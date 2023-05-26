package FileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FacultyDataGenerator {

    public static void main(String[] args) {
        FacultyDataGenerator fd=new FacultyDataGenerator();
        String fileName = "C:/Users/virat/OneDrive/java/files/Salary.txt";
        int numOfLines = 100;

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (int i = 1; i <= numOfLines; i++) {
                String firstName = "FirstName";
                String lastName = "LastName";
                String rank = generateRandomRank();
                double salary = generateRandomSalary(rank);

                String line = firstName + " " + lastName + ", " + rank + ", " + String.format("%.2f", salary);
                printWriter.println(line);
            }

            printWriter.close();
            System.out.println("Data file created: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while creating the data file.");
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        

    }

    private static String generateRandomRank() {
        String[] ranks = {"assistant", "associate", "full"};
        Random random = new Random();
        int index = random.nextInt(ranks.length);
        return ranks[index];
    }

    private static double generateRandomSalary(String rank) {
        double salary;
        Random random = new Random();

        switch (rank) {
            case "assistant":
                salary = random.nextDouble() * (80000 - 50000) + 50000;
                break;
            case "associate":
                salary = random.nextDouble() * (110000 - 60000) + 60000;
                break;
            case "full":
                salary = random.nextDouble() * (130000 - 75000) + 75000;
                break;
            default:
                salary = 0.0;
        }

        return salary;
    }
}

