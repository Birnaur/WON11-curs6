package homeworkcurs11;

import java.util.List;

public enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class DaySchedule {
    private Day day;
    private List<String> activities;

    public DaySchedule(Day day, List<String> activities) {
        this.day = day;
        this.activities = activities;
    }

    // getters and setters
    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }
}


