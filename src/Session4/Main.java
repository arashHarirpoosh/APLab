package Session4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person a = new Person("a", "A");
        Person b = new Person("b", "B");
        Person c = new Person("c", "C");

        VotingSystem vs = new VotingSystem();

        vs.createVoting("\"Which one is correct?", 1);
        vs.createVoting("\"Which one is wrong?", 0);

        vs.getVotingList().get(0).createPoll("A");
        vs.getVotingList().get(0).createPoll("B");
        vs.getVotingList().get(0).createPoll("C");

        vs.getVotingList().get(1).createPoll("A");
        vs.getVotingList().get(1).createPoll("B");
        vs.getVotingList().get(1).createPoll("C");

        ArrayList<String> ca = new ArrayList<>();
        ArrayList<String> cb = new ArrayList<>();
        ArrayList<String> cc = new ArrayList<>();

        ca.add("A");
        cb.add("B");
        cc.add("A");

        vs.vote(0, a, ca);
        vs.vote(0, b, cb);
        vs.vote(0, c, cc);

        vs.vote(1, a, ca);
        vs.vote(1, b, cb);
        vs.vote(1, c, cc);

        vs.printResult(0);
        vs.printResult(1);
        System.out.println("-------------");

        ca.add("B");
        cb.add("C");
        cc.add("B");

        vs.vote(0, a, ca);
        vs.vote(0, b, cb);
        vs.vote(0, c, cc);

        vs.vote(1, a, ca);
        vs.vote(1, b, cb);
        vs.vote(1, c, cc);

        vs.printResult(0);
        vs.printResult(1);
    }
}
