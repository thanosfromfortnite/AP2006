public class Appointment {
    private TimeInterval time;

    public Appointment(int t) {
        time = new TimeInterval(t);
    }

    public TimeInterval getTime() {
        return time;
    }

    public boolean conflictsWith(Appointment other) {
        return getTime().overlapsWith(other.getTime());
    }
}
