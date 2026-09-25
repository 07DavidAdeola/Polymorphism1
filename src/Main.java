// https://github.com/07DavidAdeola/Polymorphism1.git
public class Main {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.display_course_information();

        COSC113 section1 = new COSC113();
        section1.display_course_information();

        // Polymorphism
        Course cosc214 = new Course();
        Course section2 = new COSC113();
        // The relationship is: IS-A relationship between course and COSC113

        cosc214.display_course_information();
        section2.display_course_information();

        // Student object
        Student arturo = new Student();
        Course math141 = new Course();
        Course FRSE = new Course();
        Course COSC107 = new Course();
        Course eng102 = new Course();
        Course soc101 = new Course();

        arturo.enrolled_courses[0] = math141;
        arturo.enrolled_courses[1] = FRSE;
        arturo.enrolled_courses[2] = COSC107;
        arturo.enrolled_courses[3] = eng102;
        arturo.enrolled_courses[4] = soc101;

        // Lab- work: Populate index 1 to 4 with the other course references

        BSU_Member[] members = new BSU_Member[10];

        BSU_Member b1, b2;
        // Creating an object of student type and storing the reference in a BSU-Member type variable
        b1 = new Student();
        b2 = new Instructor();

        members[0] = b1;
        members[1] = b2;

        // Lab Work:Create multiple Instructor, Student and BSU_Member objects and
        // assign them at different indices of the  member array

        System.out.println("===========================================");

        members[2] = new Instructor();
        members[3] = new Instructor();

        members[4] = new Student();
        members[5] = new Student();
        members[6] = new Student();

        members[7] = new BSU_Member();
        members[8] = new BSU_Member();
        members[9] = new BSU_Member();

        System.out.println("===========================================");

        for (int j = 0; j < 10; j++) {
            members[j].display_information();
        }
    }
}

