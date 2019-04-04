package app;


public class App {
    private int selectedDragons;
    public String test;
    public App() {
        selectedDragons = 0;
        MainMenu mainMenu = new MainMenu();
        DayMenu dayMenu = new DayMenu();
        mainMenu.printMenuHeader();
        for (int i = 0; i < 12; i++) {
            dayMenu.printMenuHeader();
            selectedDragons = Menu.gatherNumber("dragons", 0, 6);
            System.out.println("Some action taken with these dragons......");
            Menu.pauseMenu();
            selectedDragons = Menu.gatherNumber("more dragons", 0, 6 - selectedDragons);
            System.out.println("Some action taken with the rest of these dragons......");
            Menu.pauseMenu();
            System.out.println("You have finished your actions for this day.");
            System.out.println("On to the next day!");
            Menu.pauseMenu();
            Menu.clearMenu();
        }
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}