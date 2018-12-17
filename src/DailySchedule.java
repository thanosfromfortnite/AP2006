import java.util.*;

public class DailySchedule {
    private ArrayList<Appointment> apptList;

    public DailySchedule(int[] times) {
        apptList = new ArrayList<Appointment>();
        for (int i = 0; i < times.length; i ++) {
            apptList.add(new Appointment(times[i]));
        }
    }

    public void clearConflicts(Appointment appt) {
        for (int i = 0; i < apptList.size(); i ++) {
            if (appt.conflictsWith(apptList.get(i))) {
                apptList.remove(i);
            }
        }
    }

    public boolean addAppt(Appointment appt, boolean emergency) {
        if (emergency) {
            clearConflicts(appt);
            apptList.add(appt);
            return true;
        }
        for (int i = 0; i < apptList.size(); i ++) {
            if (appt.conflictsWith(apptList.get(i))) {
                return false;
            }
        }
        apptList.add(appt);
        return true;
    }

    public int getSchedule(int i) {
        return apptList.get(i).getTime().getTimeAgain();
    }
}
