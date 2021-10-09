package Session2;

public class Student {
    private String firstName, lastName, id;
    private int grade;
    /**
     * Create a new student with a given name and ID number (Constructor of the Student Class)
     * @param fName first name of the student
     * @param lName last name of the student
     * @param sID student IF
     */
    public Student(String fName, String lName, String sID) {
        this.firstName = fName;
        this.lastName = lName;
        this.id = sID;
        this.grade = 0;
    }

    /**
     * get the first name of the student (Getter for firstName)
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return lastName field
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @return studentID field
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return grade field
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Setter for the firstName
     * @param firstName set first name of a student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @param lastName set last name of a student
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @param id set ID of a student
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @param grade set grade of a student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Print the student's last name and ID number
     to the output terminal.
     */
    public void print() {
        System.out.println(this.lastName + ", student ID: "
                + this.id + ", grade: " + grade);
    }
}
