public class Student {
    // THIS IS AN EXAMPLE OF BAD STATIC USAGE

    private static String name;
    private int studentID;
    
    public Student(String studentName, int studentID) {
        name = studentName;
        this.studentID = studentID;
    }
    
    public String getName() {
        return name;
    }

    public String toString() {
        return "Student Name:\t" + name + "\nStudent ID:\t" + studentID;
    }
    
    public static void main(String[] args) {
        // Create first student
        Student student1 = new Student("George", 12345);
        // Create second student
        Student student2 = new Student("Kerim", 67890);
        System.out.println(student1);
        System.out.println(student2);
    }
}