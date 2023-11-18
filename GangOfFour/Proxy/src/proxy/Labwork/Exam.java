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
public interface Exam {
    void load();
    ExamResults getResultForStudent(String studentId);
    ExamResults getResultsForTeacher();
}
