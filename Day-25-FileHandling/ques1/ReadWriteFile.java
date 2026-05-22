import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA-Practice\\Day-25-FileHandling\\ques1//";

        // File class create a handle to access file
        File myFile = new File(fileName + "demo.txt");

        // Write in a file
        try {
            myFile.createNewFile();
            FileWriter writer = new FileWriter(myFile);

            writer.write("The java daily sheet is very useful.");
            writer.write("\nThanks! to paras jain sir. O_O");

            writer.close();

            System.out.println("Successfully write to file : " + myFile.getName());
            System.out.println("File Path : " + myFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read a file
        try (Scanner input = new Scanner(myFile)) {
            System.out.println("\nFile content => ");
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
