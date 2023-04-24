package homeworkcurs12.exercice2;

import homeworkcurs12.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DailyPlannerApp {
    private final DailyPlanner planner;

    public DailyPlannerApp() {
        planner = new DailyPlanner();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addActivity(scanner);
                    break;
                case 2:
                    removeActivity(scanner);
                    break;
                case 3:
                    listAllActivities();
                    break;
                case 4:
                    endPlanning();
                    break;
                default:
                    System.out.println("Invalid option, please choose again");
                    break;
            }
        }
    }

    private void displayMenu() {
        System.out.println("Please choose an option:");
        System.out.println("1. Add an activity");
        System.out.println("2. Remove an activity");
        System.out.println("3. List all activities");
        System.out.println("4. End planning");
    }

    private void addActivity(Scanner scanner) {
        System.out.println("Day:");
        Day day = Day.valueOf(scanner.next().toUpperCase());
        System.out.println("Activity:");
        String activity = scanner.next();
        try {
            planner.addActivity(day, activity);
            System.out.println("Activity added");
        } catch (NoActivityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void removeActivity(Scanner scanner) {
        System.out.println("Day:");
        Day day = Day.valueOf(scanner.next().toUpperCase());
        System.out.println("Activity:");
        String activity = scanner.next();
        try {
            planner.removeActivity(day, activity);
            System.out.println("Activity removed");
        } catch (NoActivityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void listAllActivities() {
        for (DaySchedule schedule : planner.getSchedules()) {
            Day day = schedule.getDay();
            List<String> activities = schedule.getActivities();
            System.out.println(day + ": " + activities.toString());
        }
    }

    private <NoActivitiesForDayException> void endPlanning() {
        try {
            Map<Day, List<String>> activitiesByDay = planner.endPlanning();
            for (Day day : activitiesByDay.keySet()) {
                List<String> activities = activitiesByDay.get(day);
                System.out.println(day + ": " + activities.toString());
            }
        } catch (NoActivitiesForDayException | NoActivityExeption e) {
            System.out.println("Error: " + e.getClass());
        }
    }

    public static void main(String[] args) {
        DailyPlannerApp app = new DailyPlannerApp();
        app.start();
    }
}

