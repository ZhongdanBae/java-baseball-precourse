package view;

import java.util.Scanner;

public class Inputview {
    private final Scanner scanner = new Scanner(System.in);

    public String readNumber() {
        return scanner.nextLine();
    }

    public String readRestart() {
        return scanner.nextLine();
    }
}
