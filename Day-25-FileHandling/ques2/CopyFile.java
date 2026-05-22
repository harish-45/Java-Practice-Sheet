
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA-Practice\\Day-25-FileHandling\\ques2//copy_notes.pdf";
        String newFileName = "C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA-Practice\\Day-25-FileHandling\\ques2//CSO_notes_removed.pdf";

        // File class create a handle to access file
        // FileInputStream class is used to read data from a file in the form of bytes.
        // FileOutputStream class is used to write data to a file in the form of bytes
        // try-with-resources statement is used to automatically close the resources after use, which helps to prevent resource leaks and ensures that the file streams are properly closed even if an exception occurs. 

        try (FileInputStream input = new FileInputStream(fileName);
                FileOutputStream output = new FileOutputStream(newFileName)) {
            
            // i is used to read the data from the input file and write it to the output file. The read() method returns -1 when the end of the file is reached, so the loop continues until all bytes are read and written to the new file.
            
            int i;
            while ((i = input.read()) != -1) {
                output.write(i);
            }

            System.out.println("File copied Successfully! ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}