package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        }
        if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        }
        if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        }
        if (month == 9 || month == 10 || month == 11) {
            System.out.println("Winter");
        }
        if(month<1 || month>12) {
            System.out.println("wrong number!");
        }

    }
}
