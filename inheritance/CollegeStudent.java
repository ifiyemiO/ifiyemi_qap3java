public class CollegeStudent extends Student {
    private String major;  // the student's major
    private int year;      // the student's current year

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);  // Calls superclass constructor
        this.year = year;
        this.major = major;
    }

    // Getter methods
    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}