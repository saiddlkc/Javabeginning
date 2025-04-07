import java.util.Scanner;

public class Nain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double widht = 5.0;
        double height = 10.0;
        double area = widht * height;

        System.out.print("Width of the rectangle: ");
        widht = scanner.nextDouble();
        System.out.print("Height of the rectangle: ");
        height = scanner.nextDouble();
        area = widht * height;
        System.out.println("Area of the rectangle is: " + area);

        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();

        // System.out.print("Are you a student? (true/false): ");
        // boolean isStudent = scanner.nextBoolean();

        // System.out.println("Your name is: " + name);

        // if (age < 18) {
        // System.out.println("You are too young.");
        // } else if (age >= 18 && age < 65) {
        // System.out.println("You are an adult.");
        // } else {
        // System.out.println("You are a .");
        // }
        // if (isStudent) {
        // System.out.println("You are a student at BHT.");
        // } else {
        // System.out.println("You are NOT a student ");
        // }

        scanner.close();

    }
}
