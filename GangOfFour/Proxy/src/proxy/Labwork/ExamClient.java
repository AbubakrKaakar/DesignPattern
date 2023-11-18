/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy.Labwork;

/**
 *
 * @author abuba
 */
public class ExamClient {
    public static void main(String[] args) {
        // Simulate a student viewing their results
        Exam studentExam = new ProtectedExamProxy(false);
        ExamResults studentResults = studentExam.getResultForStudent("student1");
        System.out.println("Student View:\n" + studentResults);

        // Simulate a teacher viewing all results
        Exam teacherExam = new ProtectedExamProxy(true);
        ExamResults teacherResults = teacherExam.getResultsForTeacher();
        System.out.println("\nTeacher View:\n" + teacherResults);
    }
}