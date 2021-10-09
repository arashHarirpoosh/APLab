package Session3.clockDisplay;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.now();
        ClockDisplay cd = new ClockDisplay(ld.getHour(), ld.getMinute(), ld.getSecond());
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cd.timeTick();
            System.out.println(cd.getTime());
        }
    }
}
