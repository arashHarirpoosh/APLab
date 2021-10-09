package Session2;

public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     * Create a new lab with a given day and capacity
     * @param day day of the lab
     * @param capacity capacity of the lab
     */
    public Lab(String day, int capacity) {
        this.avg = 0;
        this.day = day;
        this.capacity = capacity;
        this.currentSize = 0;
    }

    /**
     * Add given student to the lab
     * @param std Student that wants to add in lab
     */
    public void enrollStudent(Student std) {
        if (this.currentSize < this.capacity) {
            this.students[this.currentSize] = std;
            this.currentSize++;
        }
        else {
            System.out.println("Lab is Full");
        }
    }

    /**
     * Print info of the lab students and their average grades
     */
    public void print() {
        for (Student student : this.students) {
            if (student != null) {
                student.print();
            }
        }
        System.out.println("Average grade of the class: " + String.valueOf(this.avg));
    }

    /**
     *
     * @return students of the lab
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * Set students of the lab
     * @param students Array contain students of the lab
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     *
     * @return Average grade of the lab
     */
    public int getAvg() {
        return avg;
    }

    /**
     * Set average grade of the lab
     * @param avg average grade of the lab
     */
    public void setAvg(int avg) {
        this.avg = avg;
    }

    /**
     *
     * @return Day of the lab
     */
    public String getDay() {
        return day;
    }

    /**
     * Set the day of the lab
     * @param day Day field of the lab
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     *
     * @return capacity of the lab
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Set capacity of the lab
     * @param capacity Capacity field of the lab
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     *
     * @return Current Size field of the lab
     */
    public int getCurrentSize() {
        return currentSize;
    }

    /**
     * Set currentSize field of the lab
     * @param currentSize Current size field of the lab
     */
    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    /**
     * Calculate average grade of the class
     */
    public void calculateAvg() {
        int allGrade = 0;
        for (Student student : this.students) {
            if (student != null) {
                allGrade += student.getGrade();
            }
        }
        this.avg = allGrade / this.currentSize;
    }
}
