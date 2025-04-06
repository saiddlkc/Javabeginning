public class Main {

    public static void main(String[] args) {

        // System.out.println(2+2);
        // System.out.print("Ich kann rechnen");
        int age = 21; // Ganze zahlen
        System.out.println(age);

        double price = 18.4; // komma zahlen und unvollständige
        System.out.println(price);

        boolean isStudent = false;
        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a Student");
        }

        char grade = 'A';
        char symbol = '$';
        System.out.println("19.99" + symbol);

        String name = "Said Ali Dalkilic";
        String email = "sadaAdmin01@gmail.com";
        System.out.println("Admins online : " + name + " " + email);
        if (isStudent) {
            System.out.println("You are a student");
        } else if (age > 18) {
            System.out.println("You are not a student but you are older than 18");
        } else if (age < 18) {
            System.out.println("You are not a student and you are younger than 18");
        } else if (age == 18) {
            System.out.println("You are not a student but you are exactly 18");

        } else {
            System.out.println("kicked from the Server");

        }

    }
}
