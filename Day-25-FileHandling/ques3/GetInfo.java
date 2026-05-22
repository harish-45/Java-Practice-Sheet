import java.io.File;

public class GetInfo {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA-Practice\\Day-25-FileHandling\\ques2//CSO_notes_removed.pdf";
        File myFile = new File(fileName);

        // Properties of file
        System.out.println("File Exist         : " + myFile.exists());
        System.out.println("File Name          : " + myFile.getName());
        System.out.println("File Path          : " + myFile.getAbsolutePath());
        System.out.println("File Writable      : " + myFile.canWrite());
        System.out.println("File Readable      : " + myFile.canRead());
        System.out.println("File Size in bytes : " + myFile.length());

    }
}