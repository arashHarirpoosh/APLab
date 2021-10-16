package Session4;

import ir.huri.jcal.JalaliCalendar;

import java.time.LocalDateTime;
import java.util.*;

public class Voting {
    private Integer type;
    private String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> polls;

    /**
     * Constructor for Voting object
     * @param type Type of the voting
     * @param question Question of the voting
     */
    public Voting(Integer type, String question) {
        this.type = type;
        this.question = question;
        this.voters = new ArrayList<>();
        this.polls = new HashMap<>();
    }

    /**
     *
     * @return The question of the vote
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Add a new choice to the voting
     * @param choice The choice that wants to be added
     */
    public void createPoll(String choice) {
        this.polls.put(choice, new HashSet<Vote>());
    }

    /**
     *
     * @param p The object of the person
     * @param selected_polls List of the votes of the given person
     */
    public  void vote(Person p, ArrayList<String> selected_polls) {
        LocalDateTime date = LocalDateTime.now();
        if (!(this.type == 0 && selected_polls.size() > 1)) {
            for (String selected_poll : selected_polls) {
                this.polls.get(selected_poll).add(new Vote(p, new JalaliCalendar(new GregorianCalendar
                        (date.getYear(), date.getMonthValue(), date.getDayOfMonth())).toString()));
            }
        }
        else {
            System.out.println("You can just choose one poll!!!");
        }
    }

    /**
     * Print the result of the voting
     */
    public void printVotes() {
        System.out.println(this.question);
        for (Object o : this.polls.keySet()) {
            String key = o.toString();
            System.out.println(key + ": " + this.polls.get(key).size());
        }
    }
    /**
     *
     * @return The list of Person who contribute in the vote
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    /**
     *
     * @return The choices of the votes
     */
    public HashMap<String, HashSet<Vote>> getPolls() {
        return polls;
    }
}
