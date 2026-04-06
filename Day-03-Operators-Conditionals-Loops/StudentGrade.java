import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Student marks: ");
        int marks = in.nextInt();

        if (marks > 90) {
            System.out.println("Student passed with 'A+' grade");
        } else if (marks <= 90 && marks > 75) {
            System.out.println("Student passed with 'A' grade");
        }else if (marks <= 75 && marks > 60) {
            System.out.println("Student passed with 'B' grade");
        }else if (marks <= 60 && marks > 45) {
            System.out.println("Student passed with 'c' grade");
        }else if (marks <= 45 && marks >= 33) {
            System.out.println("Student passed with 'D' grade");
        } else {
            System.out.println("Student Failed😞");
        }

        in.close();
    }
}
