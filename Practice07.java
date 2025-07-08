// Course Management System : 

 
class Student {
    int id;
    String name;
    String program;

    public Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    void displayStudent() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", Program: " + program);
    }
}

class Instructor {
    int id;
    String name;
    String department;
    String title;

    public Instructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    void displayInstructor() {
        System.out.println("Instructor ID: " + id + ", Name: " + name + ", Department: " + department + ", Title: " + title);
    }
}

class Course {
    int id;
    String syllabus;
    String title;
    String credits;
    String prerequisite;

    public Course(int id, String syllabus, String title, String credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    void displayCourse() {
        System.out.println("Course ID: " + id + ", Title: " + title + ", Credits: " + credits + ", Prerequisite: " + prerequisite);
    }
}

class CourseOffering {
    int studentID;
    int instructorID;
    int courseID;
    Date time;
    int sectionNo;
    int roomID;
    int year;
    char semester;

    public CourseOffering(int studentID, int instructorID, int courseID, Date time, int sectionNo, int roomID, int year, char semester) {
        this.studentID = studentID;
        this.instructorID = instructorID;
        this.courseID = courseID;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomID = roomID;
        this.year = year;
        this.semester = semester;
    }

    void displayCourseOffering() {
        System.out.println("Student ID: " + studentID + ", Instructor ID: " + instructorID + ", Course ID: " + courseID + ", Section: " + sectionNo + ", Room: " + roomID + ", Year: " + year + ", Semester: " + semester);
    }
}

public class CourseManagementSystem {
    public static void main(String[] args) {
        Student student = new Student(1, "Smith", "Computer Science");
        student.displayStudent();

        Instructor instructor = new Instructor(101, "Dr. Alice", "CS Department", "Professor");
        instructor.displayInstructor();

        Course course = new Course(201, "Java Programming Syllabus", "Java Programming", "3", "Basic Programming");
        course.displayCourse();

        CourseOffering offering = new CourseOffering(1, 101, 201, new Date(), 1, 202, 2025, 'F');
        offering.displayCourseOffering();
    }
}
