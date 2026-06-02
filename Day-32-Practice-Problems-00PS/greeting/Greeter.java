import java.util.Scanner;

public class Greeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        greet(sc.nextLine());
        sc.close();
    }
    
    public static void greet(String name) {
        System.out.printf("Hello, [%s]!", name);
    }
}
