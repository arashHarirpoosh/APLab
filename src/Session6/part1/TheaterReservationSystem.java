package Session6.part1;

import java.util.LinkedList;

public class TheaterReservationSystem {
    private Reservation reservation;
    private LinkedList<PhoneNumber> custmpn;
    private LinkedList<Show> allShow;

    public TheaterReservationSystem(Reservation reservation, LinkedList<PhoneNumber> custmpn, LinkedList<Show> allShow) {
        this.reservation = reservation;
        this.custmpn = custmpn;
        this.allShow = allShow;
    }

    public void saveReservation() {}

    public void StoreCustPhone() {}

    public LinkedList<Show> ShowsBasedOnMovieDate () {}

    public void displayShowDetails() {}

    public LinkedList<PhoneNumber> phoneNumbersSpecShow() {}
}
