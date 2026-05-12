/*
B.	Create a class Student with attributes id, name, and marks. Write a Java program that:
●	Creates an array of Student objects and initializes it with at least five students' data.
●	Prints the details of students with marks greater than 75.
 */

package ques2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;

        // Array of Student
        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            Student obj = new Student();

            System.out.print("Enter Student Name :  ");
            obj.name = sc.next();

            System.out.print("Enter Student ID :  ");
            obj.id = sc.nextInt();

            System.out.print("Enter Student Marks :  ");
            obj.marks = sc.nextDouble();

            arr[i] = obj;

            System.out.println();
        }

        System.out.println("\n====Student details===== \n");

        for (Student obj : arr) {
            if (arr[0].marks >= 75) {
                System.out.println("Student id    :  " + obj.id);
                System.out.println("Student Name  :  " + obj.name);
                System.out.println("Student Marks :  " + obj.marks);
            }

            System.out.println();
        }
    }
}
