package Session4;

public class Vote {
    private Person person;
    private String date;

    /**
     * Constructor of the Vote object
     * @param person Indicate Person who fill the vote
     * @param date Indicate the date of the vote
     */
    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;
    }

    /**
     *
     * @return The Person object who vote
     */
    public Person getPerson() {
        return person;
    }

    /**
     *
     * @return The date of the vote
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param obj The object that want to be checked with current object
     * @return Whether one object equals to the given object or not
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     *
     * @return The hashCode for the object
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
