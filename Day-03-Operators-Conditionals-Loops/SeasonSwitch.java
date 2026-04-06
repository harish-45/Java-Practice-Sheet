import java.util.Scanner;

public class SeasonSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number from '1 to 4' corresponding to season: ");
        int n = in.nextInt();

        if (n > 0 && n < 5) {
            System.out.print("The Current Season is: ");
        }

        switch (n) {
            case 1:
                System.out.print("'Spring'");
                break;
            case 2:
                System.out.print("'Summer'");
                break;
            case 3:
                System.out.print("'Fall'");
                break;
            case 4:
                System.out.print("'Winter'");
                break;

            default:
                System.out.print("Invalid Input");
                break;
        }

        in.close();
    }
}
