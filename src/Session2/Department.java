package Session2;

public class Department {
    private String departmentName;
    private Lab[] departmentLabs;
    private int numOfLabs;
    private int currentNumOfLabs;

    /**
     * Create a new department
     * @param departmentName name of the department
     * @param numOfLabs number of labs in the department
     */
    public Department(String departmentName, int numOfLabs) {
        this.departmentName = departmentName;
        this.numOfLabs = numOfLabs;
    }

    /**
     *
     * @return The name of the department
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     *
     * @param departmentName Set the name of the department
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     *
     * @return The list of the labs in department
     */
    public Lab[] getDepartmentLabs() {
        return departmentLabs;
    }

    /**
     *
     * @param departmentLabs Set the labs of the department
     */
    public void setDepartmentLabs(Lab[] departmentLabs) {
        this.departmentLabs = departmentLabs;
    }

    /**
     *
     * @return The number of the labs in the department
     */
    public int getNumOfLabs() {
        return numOfLabs;
    }

    /**
     *
     * @param numOfLabs Set the number of the lab in the department
     */
    public void setNumOfLabs(int numOfLabs) {
        this.numOfLabs = numOfLabs;
    }

    /**
     *
     * @return The current number of labs in the department
     */
    public int getCurrentNumOfLabs() {
        return currentNumOfLabs;
    }

    /**
     *
     * @param currentNumOfLabs Set current number of the lab in the department
     */
    public void setCurrentNumOfLabs(int currentNumOfLabs) {
        this.currentNumOfLabs = currentNumOfLabs;
    }

    /**
     * Add new lab to the department labs
     * @param l Lab that wants to be add in the department
     */
    public void addLab(Lab l){
        if (this.currentNumOfLabs < this.numOfLabs) {
            this.departmentLabs[this.currentNumOfLabs] = l;
            this.currentNumOfLabs++;
        }
        else {
            System.out.println("You cant add any other lab");
        }
    }

    /**
     * Print info of the each lab in the department
     */
    public void print() {
        for (int i = 0; i < this.currentNumOfLabs; i++) {
            System.out.println("Lab " + this.departmentLabs[i].getDay() + ":");
            this.departmentLabs[i].print();
        }
    }
}
