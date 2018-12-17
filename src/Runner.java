public class Runner {
    public static void main(String[] args) {
        int[] APPOINTMENTS = {1, 2, 500, 27, 39};
        for (int i = 0; i < APPOINTMENTS.length - 1; i ++) {
            System.out.print(APPOINTMENTS[i] + ", ");
        }
        System.out.print(APPOINTMENTS[APPOINTMENTS.length - 1]);

        DailySchedule mySchedule = new DailySchedule(APPOINTMENTS);

        System.out.println("gonna add an appointment for 12 to go get that bread");
        mySchedule.addAppt(new Appointment(12), false);
    }
}
