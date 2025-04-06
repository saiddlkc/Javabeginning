import java.util.Scanner;

public class Nain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("Enter your height in cm: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        if (isStudent) {
            System.out.println("You are a student at BHT.");
        } else {
            System.out.println("You are  NOT a student ");
        }
        System.out.println("Your height is: " + height + " cm");
        System.out.println("Your weight is: " + weight + " kg");

        scanner.close();

    }
}
