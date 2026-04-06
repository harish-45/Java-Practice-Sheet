import java.util.Scanner;

public class AgeMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        System.out.println("You are " + age + " years old.");

        in.close();
    }
}
