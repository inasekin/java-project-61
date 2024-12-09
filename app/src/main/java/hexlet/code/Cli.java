package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void getName() {
        Scanner inCli = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = inCli.next();
        System.out.println("Hello, " + name + "!");
        inCli.close();
    }
}
