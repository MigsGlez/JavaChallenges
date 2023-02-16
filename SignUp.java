import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");

        // Task 1 - Using Scanner, ask the user questions

        // Ask for their first name.
        System.out.println("What is your first name?");
        String name = scan.nextLine();

        // Ask for their last name.
        System.out.println("What is your last name?");
        String lastName = scan.nextLine();

        // Ask: how old are you?
        System.out.println("How old are you?");
        int age = scan.nextInt();

        scan.nextLine();

        /*
         * Ask them to make a username. SIDE NOTE:
         * 
         * – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(),
         * nextLong().
         * – You will understand why this happens when we cover Delimiters in the next
         * section (Booleans and Conditionals).
         * – For now, just know that the solution is to add an extra nextLine().
         */
        System.out.println("Create a username");
        String username = scan.nextLine();

        // Ask what city they live in.
        System.out.println("What city do you live in?");
        String city = scan.nextLine();

        // Ask what country that's from.
        System.out.println("What country is that?");
        String country = scan.nextLine();

        // Task 2 - Print their information.

        // Print their information like so:

        System.out.println("\n Your information: ");
        System.out.println("\tFirst Name: " + name +
                "\n\tLast Name: " + lastName +
                "\n\tAge: " + age +
                "\n\tUsername: " + username +
                "\n\tCity: " + city +
                "\n\tCountry: " + country +
                "");
        System.out.println("Thank you for joining JavaGram!");
        // close scanner. It's good practice :D !
        scan.close();
    }
}
