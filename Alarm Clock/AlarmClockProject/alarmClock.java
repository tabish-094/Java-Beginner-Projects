package AlarmClockProject;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

class alarmClock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmtime = null;

        while (alarmtime == null) {
            try {
                System.out.println("Enter the time for alarm in HH:mm:ss format:");
                String inputTime = s.nextLine();
    
                alarmtime = LocalTime.parse(inputTime, dtf);
                System.out.println("Alarm set for " + alarmtime);
    
            }
    
            catch (DateTimeParseException e) {
                System.out.println("Invalid time format. Please enter time in HH:mm:ss format.");
               
            }

        }
        
        alarmclass alarm = new alarmclass(alarmtime);
        Thread alarmThread = new Thread(alarm);
        alarmThread.start();

        s.close();
    }
}