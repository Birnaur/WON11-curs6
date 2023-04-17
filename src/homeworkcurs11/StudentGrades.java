package homeworkcurs11;

import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Alice", 95);
        grades.put("Bob", 87);
        grades.put("Charlie", 92);
        grades.put("David", 89);


        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        String highestScoringStudent = null;
        int highestGrade = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            if (entry.getValue() > highestGrade) {
                highestGrade = entry.getValue();
                highestScoringStudent = entry.getKey();
            }
        }
        System.out.println("The student with the highest grade is " + highestScoringStudent + " with a grade of " + highestGrade);
    }
}
