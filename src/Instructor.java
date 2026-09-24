public class Instructor extends BSU_Member {
    String department;

    Instructor(){
        this.department = "CS";
        this.status = "Faculty";
    }

    //Task: Create a display method that will print the department name and status

    public void display_department() {
        System.out.println("Inside Instructor---------- Department: " + this.department + " Faculty: " + this.status);
    }
}
