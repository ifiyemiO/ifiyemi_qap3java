public class Student extends Person {
    protected String myIdNum;    // the Student Id Number
    protected double myGPA;      // the grade point average

    public Student(String name, int age, String gender, String idNum, double gpa)  {
    // the super class’ constructor
    super(name, age, gender);
    
    // initializing what’s new to Student
    myIdNum = idNum;
    myGPA = gpa;
    }     

    // Getter methods
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    // Setter methods
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // toString method
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
