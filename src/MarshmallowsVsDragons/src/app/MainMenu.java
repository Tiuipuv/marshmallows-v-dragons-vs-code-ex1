package app;

public class MainMenu extends Menu {
    @Override
    public void printMenuHeader() {
        System.out.println("Welcome to Dragons vs Marshmallows!\n");
        System.out.println("\tIn this turn based game, you will be responsible for defeating the mighty and evil, well, evil genius!");
        System.out.println("\tYour job is to manage your precious dragons and tear down the evil genius' lair!");
        System.out.println("\tBeware of the marshmallows he will surely send your way in the process, they are terrifying creatures capable of \tbringing death to your dragons.");
        System.out.println("\n\n\n\nGOOD LUCK!");
        pauseMenu();
        clearMenu();
    }
}