package homeworkcurs12;

public class NoActivityException extends RuntimeException {
    public NoActivityException(String message) {
        super(message);
    }
}

class NoActivitiesForDayException extends Exception {
    public NoActivitiesForDayException(String message) {
        super(message);
    }
}


