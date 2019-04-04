package app;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public void printMenuHeader() {
        System.err.println("Generic Menu Header");
    }
    public static int gatherNumber(String name, int min, int max) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number for " + name + " between " + min + " and " + max + ": ");
        int number = reader.nextInt();
        return number;
    }
    public static void pauseMenu() {
        System.out.println("Press \"ENTER\" to continue...");
        try {
            int read = System.in.read(new byte[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void clearMenu() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        catch(Exception e) {}
    }
}