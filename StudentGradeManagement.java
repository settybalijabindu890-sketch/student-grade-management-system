import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[3];
    double average;
    String grade;

    // Method to calculate average
    void calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        average = sum / 3.0;
    }

    // Method to calculate grade
    void calculateGrade() {
        if (average >= 75) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }
    }

    // Method to display student report
    void displayReport() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

 public class StudentGradeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        // Input student details
        System.out.print("Enter student name: ");
        s.name = sc.nextLine();

        System.out.println("Enter marks in 3 subjects:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            s.marks[i] = sc.nextInt();
        }

        // Process and display
        s.calculateAverage();
        s.calculateGrade();
        s.displayReport();

        sc.close();
    }
}