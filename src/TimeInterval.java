public class TimeInterval {
    private int time;
    public TimeInterval(int t) {
        this.time = t;
    }

    public boolean overlapsWith(TimeInterval interval) {
        return (this.time == interval.time);
    }

    public int getTimeAgain() {
        return time;
    }
}
