package utils;

import java.util.Scanner;

public class InputHandler {

    private Scanner sc = new Scanner(System.in);
    public String getStringInput(String prompt) {
        IO.print(prompt + " ");
        return sc.nextLine();
    }


    public int getIntInput(String prompt) {
        IO.print(prompt + " ");
        while (!sc.hasNextInt()) {
            IO.print("Please type a whole number: ");
            sc.next();
        }
        int value = sc.nextInt();
        sc.nextLine(); // clear the line
        return value;
    }
    public int getIntInput(String prompt, int min, int max) {
        while (true) {
            int value = getIntInput(prompt);
            if (HelperUtils.isValidNumber(value, min, max)) {
                return value;
            }
            IO.println("Please enter a number between " + min + " and " + max + ".");
        }
    }
    public double getDoubleInput(String prompt) {
        IO.print(prompt + " ");
        while (!sc.hasNextDouble()) {
            IO.print("Please type a number: ");
            sc.next();
        }
        double value = sc.nextDouble();
        sc.nextLine();
        return value;
    }
    public boolean getConfirmation(String prompt) {
        IO.print(prompt + " (yes/no) ");
        String answer = sc.nextLine().trim().toLowerCase();
        return answer.equals("yes") || answer.equals("y");
    }
}
