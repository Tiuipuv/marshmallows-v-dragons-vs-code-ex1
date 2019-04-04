package app;

public class DayMenu extends Menu {
    private int currDay = 0;
    @Override
    public void printMenuHeader() {
        currDay++;
        System.out.println("It is currently day " + currDay);
        System.out.println("\n\tFrom this day menu, it is your responsibility to manage your dragons.");
        System.out.println("\tAssign tasks to all of your dragons for the day, and then you can proceed.\n\n");
    }
}