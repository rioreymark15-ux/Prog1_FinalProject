
import java.util.Scanner;

public class FinalProject {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String programmer = "Reymark Rio";
        String course = "Information Technology";

        System.out.println("====================================");
        System.out.println("          JAVA FINAL PROJECT");
        System.out.println("====================================");
        System.out.println("Programmer: " + programmer);
        System.out.println("Course: " + course);
        System.out.println("====================================");

        System.out.println("\nWelcome to my Java Final Project!");

        System.out.print("\nEnter your full name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("What is your favorite programming language? ");
        String language = input.nextLine();

        System.out.println("\n========== STUDENT INFORMATION ==========");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Favorite Programming Language: " + language);
        System.out.println("Number of characters in your name: " + name.length());

        System.out.println("\n========== GRADE CALCULATOR ==========");

        System.out.print("Enter your Java grade: ");
        double javaGrade = input.nextDouble();

        System.out.print("Enter your Programming grade: ");
        double programmingGrade = input.nextDouble();

        System.out.print("Enter your Database grade: ");
        double databaseGrade = input.nextDouble();

        if (javaGrade < 0 || javaGrade > 100
                || programmingGrade < 0 || programmingGrade > 100
                || databaseGrade < 0 || databaseGrade > 100) {

            System.out.println("\nPlease enter grades between 0 and 100.");

        } else {

            double average = (javaGrade + programmingGrade + databaseGrade) / 3.0;

            System.out.printf("\nJava Grade: %.2f%n", javaGrade);
            System.out.printf("Programming Grade: %.2f%n", programmingGrade);
            System.out.printf("Database Grade: %.2f%n", databaseGrade);
            System.out.printf("General Average: %.2f%n", average);

            if (javaGrade >= 75 && programmingGrade >= 75
                    && databaseGrade >= 75 && average >= 75) {

                System.out.println("Result: Passed");

            } else {

                System.out.println("Result: Failed");
            }

            if (average >= 90) {
                System.out.println("Remarks: Excellent!");

            } else if (average >= 85) {
                System.out.println("Remarks: Very Good!");

            } else if (average >= 80) {
                System.out.println("Remarks: Good!");

            } else if (average >= 75) {
                System.out.println("Remarks: Satisfactory!");

            } else {
                System.out.println("Remarks: Keep practicing!");
            }
        }

        System.out.println("\n========== MY SUBJECTS ==========");

        String[] subjects = {
            "Introduction to Java",
            "Computer Programming",
            "Database Management",
            "Web Development",
            "Computer Networks"
        };

        for (int i = 0; i < subjects.length; i++) {
            System.out.println((i + 1) + ". " + subjects[i]);
        }

        System.out.println("\n========== PROGRAMMING LANGUAGE GUIDE ==========");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C++");
        System.out.println("4. JavaScript");

        System.out.print("Choose a programming language (1-4): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Java is a popular language for building applications.");
                break;

            case 2:
                System.out.println("Python is beginner-friendly and easy to read.");
                break;

            case 3:
                System.out.println("C++ is often used in game development and system programming.");
                break;

            case 4:
                System.out.println("JavaScript is commonly used to create interactive websites.");
                break;

            default:
                System.out.println("You entered an invalid choice.");
                break;
        }

        System.out.println("\n========== STUDY REMINDER ==========");

        int day = 1;

        while (day <= 3) {
            System.out.println("Day " + day + ": Take some time to practice Java.");
            day++;
        }

        System.out.println("\n========== MULTIPLICATION TABLE ==========");

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        System.out.println("\n====================================");
        System.out.println("Thank you for using my program!");
        System.out.println("Created by " + programmer);
        System.out.println("Keep learning and improving your skills!");
        System.out.println("====================================");

        input.close();
    }
}
