package Session4;

public class Person {
    private String firstName, lastName;

    /**
     * Constructor of the person object
     * @param firstName Indicate the first name of the Person
     * @param lastName Indicate the last name of the Person
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     *
     * @return The first name of the Person
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     *
     * @return The last name of the Person
     */
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
