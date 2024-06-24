package User;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Jason Musa";
        student.password = "SadJason@20";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());

        //Admin
        Admin adminName = new Admin();
        adminName.name = "Barka_Boss";
        adminName.password = "12345";
        Admin results = new Admin();
        results.uploadResults("CMP 202", 95);
        System.out.println(adminName.register());
    }
}
