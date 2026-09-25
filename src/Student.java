public class Student extends BSU_Member {
    double gpa;

    Course [] enrolled_courses;

    Student(){
        this.gpa = 0;
        this.enrolled_courses = new Course[6];
        this.status = "Student";
    }

    Student(double gpa) {
        this.gpa = gpa;
        this.enrolled_courses = new Course[6];
        this.status = "Student";
    }

    public Course[] getEnrolled_courses() {
        return enrolled_courses;
    }

    @Override
    public void display_information(){
        System.out.println("Inside Student------ Status: " + status);
    }
}
