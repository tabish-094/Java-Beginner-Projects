package AlarmClockProject;

import java.time.LocalTime;

import javax.tools.Tool;
import java.awt.Toolkit;

public class alarmclass implements Runnable {
    private final LocalTime alarmtime;

    public alarmclass(LocalTime alarmtime) {
        this.alarmtime = alarmtime;
    }

    @Override
    public void run() {
        //LocalTime now = LocalTime.now();
        //System.out.println(now);

        while (LocalTime.now().isBefore(alarmtime)) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
                
                int hours = LocalTime.now().getHour();
                int minutes = LocalTime.now().getMinute();
                int seconds = LocalTime.now().getSecond();

                System.out.printf("\r%02d:%02d:%02d", hours, minutes, seconds);
               

                System.out.println(LocalTime.now());

            } catch (InterruptedException e) {
                System.out.println("Alarm interrupted: " + e.getMessage());
            }
        }

        System.out.println("\nAlarm ringing! Time to wake up!");
        Toolkit.getDefaultToolkit().beep(); // This will make a beep sound

    }

    
}
