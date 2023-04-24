package homeworkcurs12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {
    private final List<DaySchedule> schedules;

    public DailyPlanner() {
        schedules = new ArrayList<>();
        for (Day day : Day.values()) {
            schedules.add(new DaySchedule(day, new ArrayList<>()));
        }
    }

    public void addActivity(Day day, String activity) throws NoActivityException {
        if (activity == null) {
            throw new NoActivityException("Activity is null");
        }
        for (DaySchedule schedule : schedules) {
            if (schedule.getDay() == day) {
                schedule.getActivities().add(activity);
            }
        }
    }

    public void removeActivity(Day day, String activity) throws NoActivityException {
        boolean activityRemoved = false;
        for (DaySchedule schedule : schedules) {
            if (schedule.getDay() == day) {
                activityRemoved = schedule.getActivities().remove(activity);
                break;
            }
        }
        if (!activityRemoved) {
            throw new NoActivityException("Activity not found");
        }
    }

    public List<String> getActivities(Day day) {
        for (DaySchedule schedule : schedules) {
            if (schedule.getDay() == day) {
                return schedule.getActivities();
            }
        }
        return null;
    }

    public Map<Day, List<String>> endPlanning() throws NoActivityException {
        Map<Day, List<String>> result = new HashMap<>();
        for (DaySchedule schedule : schedules) {
            List<String> activities = schedule.getActivities();
            if (activities.isEmpty()) {
                throw new NoActivityException("No activities for " + schedule.getDay());
            }
            result.put(schedule.getDay(), activities);
        }
        return result;
    }

    public DaySchedule[] getSchedules() {
        return new DaySchedule[0];
    }
}

