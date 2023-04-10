package homeworkcurs10;

import java.io.PrintWriter;
import java.util.List;

public class ReportGenerator {
    private List<Student> students;
    private double lowestGrade;

    public ReportGenerator(List<Student> students) {
        this.students = students;
    }
    public void generatorReport() {
        double sum = 0;
        double highestGrade = 10;
        double loweast = 4;
        Student highestGradeStudent = null;
        Student lowestGradeStudent = null;

        for (Student student : students) {
            double grade = student.getGrade();
            sum += grade;

            if (grade > highestGrade) {
                highestGrade = grade;
                highestGradeStudent = student;
            }


            
            
            if (grade < lowestGrade) {
                lowestGrade = grade;
                lowestGradeStudent = student;
            }

        }

        double averageGrade = sum / students.size();
        

        }
    }

