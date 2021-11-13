package Session6.part1;

import java.util.LinkedList;

public class Costumer {
    private PhoneNumber cpn;
    private LinkedList<Reservation> r;
    private LinkedList<Reservation> reservations;

    public Costumer(PhoneNumber cpn, LinkedList<Reservation> r) {
        this.cpn = cpn;
        this.r = r;
    }


    public boolean reserveSeat() {}

    public Reservation reservationInfo() {}

    public boolean multipleSeatReservation() {}

    private LinkedList<Reservation> RetOldReservation() {}


    public PhoneNumber getCpn() {
        return cpn;
    }

    public void setCpn(PhoneNumber cpn) {
        this.cpn = cpn;
    }

    public LinkedList<Reservation> getR() {
        return r;
    }

    public void setR(LinkedList<Reservation> r) {
        this.r = r;
    }
}
