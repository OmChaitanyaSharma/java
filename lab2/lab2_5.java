/*Write a program in Java to take first name and last name from user and
print both in one line as last name followed by first name
Input: Enter first name: KIIT
Enter Second Name: UNIVERSITY
Output: UNIVERSITY KIIT*/
import java.util.Scanner;

public class lab2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Take first name and last name from user
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        // Output: Print last name followed by first name
        System.out.println(lastName + " " + firstName);
    }
}
