package sMs;

import java.util.ArrayList;
import java.util.List;

/*
- school contains
    - students
    - teachers
    - total money earned
    - total money spent as teachers' salary
 */
public class School {
    private List<Teacher> teachers=new ArrayList<>();
    private List<Student>students=new ArrayList<>();
    private static int totalMoneyEarned;
    private int totalMoneySpentAsTeacherSalary;

    /**
     * new school object is created, and this method would come into existence
     * @param teachers, list of teachers in the school
     * @param students, list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpentAsTeacherSalary=0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds a teacher to the school
     * @param teacher, the teacher which would be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * add a student to the school
     * @param student, the student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return, total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * adds the total money earned by the school
     * @param moneyEarned , money that is being earned and added to the totalMoneyEarned
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned = totalMoneyEarned+moneyEarned;
//        feesPaid=feesPaid+fees means feesPaid+=fees
    }

    /**
     *
     * @return total money spent by the school
     */
    public int getTotalMoneySpentAsTeacherSalary() {
        return totalMoneySpentAsTeacherSalary;
    }

    public void updateTotalMoneySpentAsTeacherSalary(int MoneySpentAsTeacherSalary) {
//        totalMoneyEarned=totalMoneyEarned-MoneySpentAsTeacherSalary;
        totalMoneyEarned-=MoneySpentAsTeacherSalary;

    }
}
