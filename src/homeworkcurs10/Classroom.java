package homeworkcurs10;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<StudentGrade> studentGrades;

    public Classroom(List<StudentGrade> studentGrades){
        this.studentGrades = studentGrades;
    }

    public List<Integer> getGradesForDiscipline(String discipline){
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade grade : studentGrades){
            if (grade.getDiscipline().equals(discipline)){
                grades.add(grade.getGrade());
            }
        }
        return grades;
    }

    public List<Integer> getGradesForStudent(String studentName){
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade grade : studentGrades) {
            if (grade.getName().equals(studentName)) {
                grades.add(grade.getGrade());
            }
        }
        return grades;
    }



    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade maxGrade = null;
        for (StudentGrade grade : studentGrades) {
            if (grade.getDiscipline().equals(discipline)) {
                if (maxGrade == null || grade.getGrade() > maxGrade.getGrade()) {
                    maxGrade = grade;
                }
            }
        }
        return maxGrade;
    }

    public StudentGrade getMiniGrade(String discipline) {
        StudentGrade miniGrade = null;
        for (StudentGrade grade : studentGrades) {
            if (grade.getDiscipline().equals(discipline)) {
                if (miniGrade == null || grade.getGrade() < miniGrade.getGrade()) {
                    miniGrade = grade;
                }
            }
        }
        return miniGrade;
    }

    public void getAverageGrade(String discipline) {

    }
    }


