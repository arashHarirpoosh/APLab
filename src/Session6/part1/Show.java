package Session6.part1;

public class Show {
    private Date showDate;
    private  Time showTime;
    private Theater th;

    public Show(Date showDate, Time showTime, Theater th) {
        this.showDate = showDate;
        this.showTime = showTime;
        this.th = th;
    }

    public void reserveSeats(){}

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    public Time getShowTime() {
        return showTime;
    }

    public void setShowTime(Time showTime) {
        this.showTime = showTime;
    }

    public Theater getTh() {
        return th;
    }

    public void setTh(Theater th) {
        this.th = th;
    }
}
