package JavaBasics.ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        int movieDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());
        double lunchDuration = breakDuration * 1.0 / 8;
        double relaxDuration = breakDuration * 1.0 / 4;
        double breakActivitiesDuration = lunchDuration + relaxDuration + movieDuration;

        if (breakActivitiesDuration <= breakDuration) {
            System.out.printf("You have enough time to watch %s and " +
                    "left with %.0f minutes free time.", title, Math.ceil(breakDuration - breakActivitiesDuration));
        } else {
            System.out.printf("You don't have enough time to" +
                    " watch %s, you need %.0f more minutes.", title, Math.ceil(Math.abs(breakDuration - breakActivitiesDuration)));
        }
    }
}
