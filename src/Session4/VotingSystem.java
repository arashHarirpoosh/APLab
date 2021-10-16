package Session4;

import java.util.ArrayList;

public class VotingSystem {
    private ArrayList<Voting> votingList;

    public VotingSystem() {
        this.votingList = new ArrayList<>();
    }

    /**
     * Add new vote to the list
     * @param question Question of the voting
     * @param type Type of the voting
     */
    public void createVoting(String question, int type) {
        this.votingList.add(new Voting(type, question));
    }

    /**
     * Print the Question for all of the voting's
     */
    public void printListOfVoting() {
        for (Voting aVotingList : this.votingList) {
            System.out.println(aVotingList.getQuestion());
        }
    }

    /**
     *
     * @param vn Vote number
     * @param p Person object
     * @param choices Persons choices
     */
    public void vote(int vn, Person p, ArrayList<String> choices){
        this.votingList.get(vn).vote(p, choices);
    }

    /**
     *
     * @param vn Voting number
     */
    public void printResult(int vn) {
        this.votingList.get(vn).printVotes();
    }

    /**
     *
     * @return The list of the voting
     */
    public ArrayList<Voting> getVotingList() {
        return votingList;
    }
}
