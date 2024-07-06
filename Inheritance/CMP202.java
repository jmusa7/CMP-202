package Inheritance;

public class CMP202 {
    int age;
    float height;
    String name;
    String password;

    void printUserDetails() {
        age = 23;
        height = 177.8F;
        name = "Sad-Jason";
        name.length();
        password = "User@123";
        if (password.contains("12345") || password.contains("User")) {
            System.out.println("The password meets strength requirements.");
        }
    }    
}
