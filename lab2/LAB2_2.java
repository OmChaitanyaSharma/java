/* Write a program to print the corresponding grade for the given
mark using if..else statement in Java
Input: Mention the grade in the program
Output: Display the Grade either O/E/A/B/C */

public class lab2_2 {
    public static void main(String[] args) {
        // Input: Mention the marks here
        int marks = 85; // You can change this value to test different marks

        // Output: Display the grade
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: O");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade: E");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade: A");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade: B");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Grade: C");
        } else if (marks < 50 && marks >= 0) {
            System.out.println("Grade: F"); // Optional fail grade
        } else {
            System.out.println("Invalid marks!"); // For marks outside 0-100
        }
    }
}
