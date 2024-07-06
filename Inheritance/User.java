package Inheritance;

import java.util.Scanner;

public class User {
    String username;
    String email;

    String login() {
        if (username.equals("Sad-Jason") && email.equals("Sad-Jason@gmail.com")) {
            return "Logged in";
        } else {
            return "Failed";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User Jason = new User();

        System.out.print("Enter username: ");
        Jason.username = scanner.nextLine();

        System.out.print("Enter email: ");
        Jason.email = scanner.nextLine();

        System.out.println(Jason.login());

        scanner.close();
    }
}
