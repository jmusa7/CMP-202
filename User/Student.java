package User;

public class Student extends User {
    String matric_no = "bhu/20/04/09/0137";
    String admission_no = "11111111";
    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Unable to Register Course";
        } else {
            return "You have registered the course";
        }
    }
    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Invalid MATRIC Number or Admission No";
        } else {
            return "PASSED";
        }
    }    
}
