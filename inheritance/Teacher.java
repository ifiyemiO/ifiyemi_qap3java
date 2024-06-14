public class Teacher extends Person {
    private String subject;  // the subject taught by the teacher
    private double salary;   // the teacher's annual salary

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);  // Calls superclass constructor
        this.subject = subject;
        this.salary = salary;
    }

    // Getter methods
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: " + salary;
    }
}